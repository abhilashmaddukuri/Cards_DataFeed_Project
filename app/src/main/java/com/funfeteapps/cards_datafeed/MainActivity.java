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

public class MainActivity extends AppCompatActivity {

    public Button btnSubmit;
    private DatabaseReference mDatabase;
    private RequestQueue queue;
    private ProgressDialog progressDialog;
    private ArrayList<PlayersNameModel> playersModelList;
    private static String ODI_PLAYERS_NAMES = "[\n" +
            " {\n" +
            "   \"A\": \"Noor Ali Zadran\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Asghar Afghan\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Najibullah Zadran\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Rahmat Shah\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Gulbadin Naib\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Samiullah Shinwari\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Mohammad Nabi\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Ikram Ali khil\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Rahid Khan\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Hamid Hassan\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Mujeeb Ur Rahman\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Aaron Finch\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"David Warner\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Usman Khawaja\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Steven Smith\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Shaun Marsh\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Glenn Maxwell\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Marcus Stoinis\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Alex Carey\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Kane Richardson\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Pat Cummins\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Nathan Coulter Nile\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Mitchell Starc\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Jason Behrendorff\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Adam Zampa\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Nathan Lyon\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Tamim Iqbal\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Sowmya Sarkar\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Sabbir Rahman\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Mahmudullah\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Mosaddek Hossain\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Shakib Al Hasan\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Mehidy Hasan\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Mushfiqur Rahim\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Mohammad Mithun\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Mashrafe Mortaza\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Rubel Hossain\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Mustafizur Rahman\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Abu Jayed\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Eoin Morgan\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Jason Roy\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Joe Root\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"James Vince\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Ben Stokes\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Moeen Ali\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Chris Woakes\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Tom Curran\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Liam Dawson\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Jofra Archer\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Jonny Bairstow\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Jos Buttler\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Liam Plunkett\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Adil Rashid\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Mark Wood\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Rohit Sharma\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Shikhar Dhawan\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Virat Kohli\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Vijay Shankar\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Hardik Pandya\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Kedar Jadhav\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Ravindra Jadeja\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Lokesh Rahul\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Ms Dhoni\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Dinesh Karthik\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Kuldeep Yadav\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Mohammed Shami\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Jasprit Bumrah\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Bhuvneshwar Kumar\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Yuzvendra Chahal\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Kane Williamson\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Martin Guptil\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Ross Taylor\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Colin de Grandhomme\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Colin Munro\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"James Neesham\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Mitchell Santner\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Tom blundell\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Tom Latham\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Henry Nicholls\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Trent Boult\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Lockie Ferguson\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Matt Henry\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Tim Southee\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Ish Sodhi\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Fakhar Zaman\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Imam ul haq\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Babar Azam\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Asif Ali\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Shoab Malik\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Mohammad Hafeez\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Haris Sohail\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Shadab khan\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Imad Wasim\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Sarfaraz Ahmed\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Shaheen Afridi\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Hasan Ali\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Wahab Riaz\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Mohammad Amir\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Faf du Plessis\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"David Miller\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Aiden Markram\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Hashim Amla\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Jean Paul Duminy\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Andile Phelhlukwayo\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Dwaine Pretorius\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Chris Morris\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Quinton de Kock\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Kagiso Rabada\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Lungi Ngidi\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Imran Tahir\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Tabraiz Shamsi\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Beuran Hendricks\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Dimuth Karunaratne\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Lahiru Thirimanne\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Angelo Mathews\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Dhananjaya de Silva\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Isuru Udana\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Milinda Siriwardana\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Thisara Perera\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Jeevan Mendis\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Kusal Perera\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Kusal Mendis\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Jeffrey Vandersay\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Lasith Malinga\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Suranga Lakmal\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Nuwan Pradeep\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Chris Gayle\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Evin Lewis\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Darren Bravo\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Shimron Hetmyer\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Andre Russel\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Carlos Brathwaite\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Jason Holder\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Nicholas Pooran\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Shai Hope\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Ashley Nurse\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Kemar Roach\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Oshane Thomas\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Shannon Gabriel\"\n" +
            " },\n" +
            " {\n" +
            "   \"A\": \"Sheldon Cottrell\"\n" +
            " }\n" +
            "]";

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
        for (int i = 0; i < 5; i++) {
            getPlayerDetailsFromName(playersModelList.get(i).getA());
        }
    }

    private void getPlayerNameFromJSON() {
        playersModelList = new Gson().fromJson(ODI_PLAYERS_NAMES, new TypeToken<List<PlayersNameModel>>() {
        }.getType());
    }

    private void getPlayerDetailsFromName(String name) {
        progressDialog.setMessage("Fetching " + name + " details");
        progressDialog.show();
        String url = "https://cricapi.com/api/playerFinder?apikey=Ub8RvO4N9UYjrxKUo1nRC8hPSyT2&name=" + name;
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        System.out.println("Hello");
                        PlayerBasicDetailsModel playerBasicDetailsModel = new Gson().fromJson(response.toString(), PlayerBasicDetailsModel.class);
                        getPlayerStats(playerBasicDetailsModel.getData()[0].getPid());
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, "1st API hit failed", Toast.LENGTH_SHORT).show();
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
        DatabaseReference mypostref = mDatabase.child("ODI").push();
        mDatabase.child("ODI/" + mypostref.getKey()).setValue(playerStatsModel);
        progressDialog.dismiss();
    }

    private void init() {
        btnSubmit = findViewById(R.id.btnSubmit);
    }
}
