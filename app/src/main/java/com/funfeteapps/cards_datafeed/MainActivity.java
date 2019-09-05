package com.funfeteapps.cards_datafeed;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

import static com.funfeteapps.cards_datafeed.Utility.ODI_PLAYERS_NAMES;
import static com.funfeteapps.cards_datafeed.Utility.ODI_PLAYERS_NAMES_2000_2010;

public class MainActivity extends AppCompatActivity {

    public Button btnSubmit;
    private DatabaseReference mDatabase;
    private RequestQueue queue;
    private ProgressDialog progressDialog;
    private ArrayList<PlayersNameModel> playersModelList;
    private static String LEGENDARY_PLAYERS_NAMES;
    public ArrayList<String> failedPlayers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressDialog = new ProgressDialog(MainActivity.this);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        // Instantiate the RequestQueue.
        queue = Volley.newRequestQueue(this);

        init();
        onClicks();
    }

    private void onClicks() {
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fetchAndPushData();
            }
        });
    }

    private void fetchAndPushData() {
        getPlayerNameFromJSON();
        for (int i = 0; i < playersModelList.size() / 2; i++) {
            getPlayerDetailsFromName(playersModelList.get(i).getA());
        }
    }

    private void getPlayerNameFromJSON() {
        playersModelList = new Gson().fromJson(ODI_PLAYERS_NAMES_2000_2010, new TypeToken<List<PlayersNameModel>>() {
        }.getType());
    }

    private void getPlayerDetailsFromName(final String name) {
        progressDialog.setMessage("Fetching " + name + " details");
        progressDialog.show();
        String url = "https://cricapi.com/api/playerFinder?apikey=Ub8RvO4N9UYjrxKUo1nRC8hPSyT2&name=" + name;
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        System.out.println("Hello");
                        PlayerBasicDetailsModel playerBasicDetailsModel = new Gson().fromJson(response.toString(), PlayerBasicDetailsModel.class);
                        if (playerBasicDetailsModel != null && playerBasicDetailsModel.getData() != null
                                && playerBasicDetailsModel.getData().length > 0 && playerBasicDetailsModel.getData()[0].getPid() != null) {
                            getPlayerStats(playerBasicDetailsModel.getData()[0].getPid());
                        } else {
                            failedPlayers.add(name);
                            System.out.println("Name missed: " + name);
                            Toast.makeText(MainActivity.this, "Missed Name: " + name, Toast.LENGTH_SHORT).show();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, "1st API hit failed" + error.networkResponse.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        queue.add(stringRequest);
    }

    private void getPlayerStats(String pid) {
        String url = "https://cricapi.com/api/playerStats?apikey=Ub8RvO4N9UYjrxKUo1nRC8hPSyT2&pid=" + pid;
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        System.out.println("Hello");
                        PlayerStatsModel playerStatsModel = new Gson().fromJson(response.toString(), PlayerStatsModel.class);
                        formatAccordingToFirebase(playerStatsModel);
                        System.out.println(playerStatsModel.getBorn());
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, "1st API hit failed", Toast.LENGTH_SHORT).show();
            }
        });
        queue.add(stringRequest);
    }

    private void formatAccordingToFirebase(PlayerStatsModel playerStatsModel) {

        PlayersFirebaseFormatModel playersFirebaseFormatModel = new PlayersFirebaseFormatModel();
        playersFirebaseFormatModel.setName(playerStatsModel.getName());
        playersFirebaseFormatModel.setFullName(playerStatsModel.getFullName());
        playersFirebaseFormatModel.setBorn(playerStatsModel.getBorn());
        playersFirebaseFormatModel.setCountry(playerStatsModel.getCountry());
        playersFirebaseFormatModel.setCurrentAge(playerStatsModel.getCurrentAge());
        playersFirebaseFormatModel.setMajorTeams(playerStatsModel.getMajorTeams());
        playersFirebaseFormatModel.setFullName(playerStatsModel.getFullName());
        playersFirebaseFormatModel.setPid(playerStatsModel.getPid());
        playersFirebaseFormatModel.setPlayingRole(playerStatsModel.getPlayingRole());
        playersFirebaseFormatModel.setBowlingStyle(playerStatsModel.getBowlingStyle());
        playersFirebaseFormatModel.setBattingStyle(playerStatsModel.getBattingStyle());
        PlayersFirebaseFormatModel.Metrics metrics = new PlayersFirebaseFormatModel.Metrics();
        ODIs batting = new ODIs();
        ODIs bowling = new ODIs();

        batting = playerStatsModel.getData().getBatting().getODIs();
        bowling = playerStatsModel.getData().getBowling().getODIs();

        metrics.setBatting(batting);
        metrics.setBowling(bowling);

        metrics.setBatting(batting);
        metrics.setBowling(bowling);

        playersFirebaseFormatModel.setMetrics(metrics);


        pushDataToFirebase(playersFirebaseFormatModel);
    }

    private void pushDataToFirebase(PlayersFirebaseFormatModel playerStatsModel) {
        DatabaseReference mypostref = mDatabase.child("ODI Legendary").push();
        mDatabase.child("ODI Legendary/" + mypostref.getKey()).setValue(playerStatsModel);
        progressDialog.dismiss();
    }

    private void init() {
        btnSubmit = findViewById(R.id.btnSubmit);
        failedPlayers = new ArrayList<>();
    }
}
