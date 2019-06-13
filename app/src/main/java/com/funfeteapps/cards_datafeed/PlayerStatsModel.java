package com.funfeteapps.cards_datafeed;

import com.google.gson.annotations.SerializedName;

public class PlayerStatsModel {

    private String country;

    private Data data;

    private String majorTeams;

    private String profile;

    private String born;

    private String battingStyle;

    private String fullName;

    private String pid;

    private String ttl;

    private String bowlingStyle;

    private String currentAge;

    private String creditsLeft;

    private Provider provider;

    private String v;

    private String imageURL;

    private String name;

    private String playingRole;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getMajorTeams() {
        return majorTeams;
    }

    public void setMajorTeams(String majorTeams) {
        this.majorTeams = majorTeams;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getBattingStyle() {
        return battingStyle;
    }

    public void setBattingStyle(String battingStyle) {
        this.battingStyle = battingStyle;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getBowlingStyle() {
        return bowlingStyle;
    }

    public void setBowlingStyle(String bowlingStyle) {
        this.bowlingStyle = bowlingStyle;
    }

    public String getCurrentAge() {
        return currentAge;
    }

    public void setCurrentAge(String currentAge) {
        this.currentAge = currentAge;
    }

    public String getCreditsLeft() {
        return creditsLeft;
    }

    public void setCreditsLeft(String creditsLeft) {
        this.creditsLeft = creditsLeft;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayingRole() {
        return playingRole;
    }

    public void setPlayingRole(String playingRole) {
        this.playingRole = playingRole;
    }

    public class Provider {
        private String source;

        private String pubDate;

        private String url;

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getPubDate() {
            return pubDate;
        }

        public void setPubDate(String pubDate) {
            this.pubDate = pubDate;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public class Data {
        private Batting batting;

        private Bowling bowling;

        public Batting getBatting() {
            return batting;
        }

        public void setBatting(Batting batting) {
            this.batting = batting;
        }

        public Bowling getBowling() {
            return bowling;
        }

        public void setBowling(Bowling bowling) {
            this.bowling = bowling;
        }
    }

    public class Batting {
        /*private ListA listA;

        private Tests tests;

        private FirstClass firstClass;

        private T20Is T20Is;*/

        private ODIs ODIs;

        /*public Tests getTests() {
            return tests;
        }

        public void setTests(Tests tests) {
            this.tests = tests;
        }

        public PlayerStatsModel.T20Is getT20Is() {
            return T20Is;
        }

        public void setT20Is(PlayerStatsModel.T20Is t20Is) {
            T20Is = t20Is;
        }*/

        public ODIs getODIs() {
            return ODIs;
        }

        public void setODIs(ODIs ODIs) {
            this.ODIs = ODIs;
        }

        /*public ListA getListA() {
            return listA;
        }

        public void setListA(ListA listA) {
            this.listA = listA;
        }

        public FirstClass getFirstClass() {
            return firstClass;
        }

        public void setFirstClass(FirstClass firstClass) {
            this.firstClass = firstClass;
        }*/
    }

    public class Bowling {
        /*private ListA listA;

        private Tests tests;

        private FirstClass firstClass;

        private T20Is T20Is;*/

        private ODIs ODIs;

       /* public Tests getTests() {
            return tests;
        }

        public void setTests(Tests tests) {
            this.tests = tests;
        }

        public PlayerStatsModel.T20Is getT20Is() {
            return T20Is;
        }

        public void setT20Is(PlayerStatsModel.T20Is t20Is) {
            T20Is = t20Is;
        }*/

        public ODIs getODIs() {
            return ODIs;
        }

        public void setODIs(ODIs ODIs) {
            this.ODIs = ODIs;
        }

        /*public ListA getListA() {
            return listA;
        }

        public void setListA(ListA listA) {
            this.listA = listA;
        }

        public FirstClass getFirstClass() {
            return firstClass;
        }

        public void setFirstClass(FirstClass firstClass) {
            this.firstClass = firstClass;
        }*/
    }

    public class FirstClass {
        private String Mat;

        @SerializedName("5w")
        private String five_w;

        @SerializedName("4w")
        private String four_w;

        private String BBI;

        private String Inns;

        private String BBM;

        private String Runs;

        private String Ave;

        private String Wkts;

        private String Balls;

        private String Econ;

        @SerializedName("10")
        private String ten;

        private String SR;

        public String getMat() {
            return Mat;
        }

        public void setMat(String mat) {
            Mat = mat;
        }

        public String getFive_w() {
            return five_w;
        }

        public void setFive_w(String five_w) {
            this.five_w = five_w;
        }

        public String getFour_w() {
            return four_w;
        }

        public void setFour_w(String four_w) {
            this.four_w = four_w;
        }

        public String getBBI() {
            return BBI;
        }

        public void setBBI(String BBI) {
            this.BBI = BBI;
        }

        public String getInns() {
            return Inns;
        }

        public void setInns(String inns) {
            Inns = inns;
        }

        public String getBBM() {
            return BBM;
        }

        public void setBBM(String BBM) {
            this.BBM = BBM;
        }

        public String getRuns() {
            return Runs;
        }

        public void setRuns(String runs) {
            Runs = runs;
        }

        public String getAve() {
            return Ave;
        }

        public void setAve(String ave) {
            Ave = ave;
        }

        public String getWkts() {
            return Wkts;
        }

        public void setWkts(String wkts) {
            Wkts = wkts;
        }

        public String getBalls() {
            return Balls;
        }

        public void setBalls(String balls) {
            Balls = balls;
        }

        public String getEcon() {
            return Econ;
        }

        public void setEcon(String econ) {
            Econ = econ;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String getSR() {
            return SR;
        }

        public void setSR(String SR) {
            this.SR = SR;
        }


        // Batting
        @SerializedName("50")
        private String fifty;

        @SerializedName("100")
        private String hundred;

        private String St;

        private String Ct;

        @SerializedName("6s")
        private String six_s;

        @SerializedName("4s")
        private String four_s;

        private String BF;
        private String HS;
        private String NO;

        public String getFifty() {
            return fifty;
        }

        public void setFifty(String fifty) {
            this.fifty = fifty;
        }

        public String getHundred() {
            return hundred;
        }

        public void setHundred(String hundred) {
            this.hundred = hundred;
        }

        public String getSt() {
            return St;
        }

        public void setSt(String st) {
            St = st;
        }

        public String getCt() {
            return Ct;
        }

        public void setCt(String ct) {
            Ct = ct;
        }

        public String getSix_s() {
            return six_s;
        }

        public void setSix_s(String six_s) {
            this.six_s = six_s;
        }

        public String getFour_s() {
            return four_s;
        }

        public void setFour_s(String four_s) {
            this.four_s = four_s;
        }

        public String getBF() {
            return BF;
        }

        public void setBF(String BF) {
            this.BF = BF;
        }

        public String getHS() {
            return HS;
        }

        public void setHS(String HS) {
            this.HS = HS;
        }

        public String getNO() {
            return NO;
        }

        public void setNO(String NO) {
            this.NO = NO;
        }
    }

    public class ListA {
        // Batting
        private String St;

        private String NO;

        private String Mat;

        private String BF;

        private String Inns;

        private String HS;

        private String Runs;

        @SerializedName("100")
        private String hundred;

        private String Ct;

        private String Ave;

        @SerializedName("50")
        private String fifty;

        @SerializedName("6s")
        private String six_s;

        @SerializedName("4s")
        private String four_s;

        private String SR;

        public String getSt() {
            return St;
        }

        public void setSt(String st) {
            St = st;
        }

        public String getNO() {
            return NO;
        }

        public void setNO(String NO) {
            this.NO = NO;
        }

        public String getBF() {
            return BF;
        }

        public void setBF(String BF) {
            this.BF = BF;
        }

        public String getHS() {
            return HS;
        }

        public void setHS(String HS) {
            this.HS = HS;
        }

        public String getHundred() {
            return hundred;
        }

        public void setHundred(String hundred) {
            this.hundred = hundred;
        }

        public String getCt() {
            return Ct;
        }

        public void setCt(String ct) {
            Ct = ct;
        }

        public String getFifty() {
            return fifty;
        }

        public void setFifty(String fifty) {
            this.fifty = fifty;
        }

        public String getSix_s() {
            return six_s;
        }

        public void setSix_s(String six_s) {
            this.six_s = six_s;
        }

        public String getFour_s() {
            return four_s;
        }

        public void setFour_s(String four_s) {
            this.four_s = four_s;
        }

        // Bowling
        @SerializedName("5w")
        private String five_w;

        @SerializedName("4w")
        private String four_w;

        private String BBI;

        private String BBM;

        private String Wkts;

        private String Balls;

        private String Econ;

        @SerializedName("10")
        private String ten;

        public String getMat() {
            return Mat;
        }

        public void setMat(String mat) {
            Mat = mat;
        }

        public String getFive_w() {
            return five_w;
        }

        public void setFive_w(String five_w) {
            this.five_w = five_w;
        }

        public String getFour_w() {
            return four_w;
        }

        public void setFour_w(String four_w) {
            this.four_w = four_w;
        }

        public String getBBI() {
            return BBI;
        }

        public void setBBI(String BBI) {
            this.BBI = BBI;
        }

        public String getInns() {
            return Inns;
        }

        public void setInns(String inns) {
            Inns = inns;
        }

        public String getBBM() {
            return BBM;
        }

        public void setBBM(String BBM) {
            this.BBM = BBM;
        }

        public String getRuns() {
            return Runs;
        }

        public void setRuns(String runs) {
            Runs = runs;
        }

        public String getAve() {
            return Ave;
        }

        public void setAve(String ave) {
            Ave = ave;
        }

        public String getWkts() {
            return Wkts;
        }

        public void setWkts(String wkts) {
            Wkts = wkts;
        }

        public String getBalls() {
            return Balls;
        }

        public void setBalls(String balls) {
            Balls = balls;
        }

        public String getEcon() {
            return Econ;
        }

        public void setEcon(String econ) {
            Econ = econ;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String getSR() {
            return SR;
        }

        public void setSR(String SR) {
            this.SR = SR;
        }
    }

    public class Tests {
        private String St;

        private String NO;

        private String Mat;

        private String BF;

        private String Inns;

        private String HS;

        private String Runs;

        @SerializedName("100")
        private String hundred;

        private String Ct;

        private String Ave;

        @SerializedName("50")
        private String fifty;

        @SerializedName("6s")
        private String six_s;

        @SerializedName("4s")
        private String four_s;

        private String SR;

        public String getSt() {
            return St;
        }

        public void setSt(String st) {
            St = st;
        }

        public String getNO() {
            return NO;
        }

        public void setNO(String NO) {
            this.NO = NO;
        }

        public String getMat() {
            return Mat;
        }

        public void setMat(String mat) {
            Mat = mat;
        }

        public String getBF() {
            return BF;
        }

        public void setBF(String BF) {
            this.BF = BF;
        }

        public String getInns() {
            return Inns;
        }

        public void setInns(String inns) {
            Inns = inns;
        }

        public String getHS() {
            return HS;
        }

        public void setHS(String HS) {
            this.HS = HS;
        }

        public String getRuns() {
            return Runs;
        }

        public void setRuns(String runs) {
            Runs = runs;
        }

        public String getHundred() {
            return hundred;
        }

        public void setHundred(String hundred) {
            this.hundred = hundred;
        }

        public String getCt() {
            return Ct;
        }

        public void setCt(String ct) {
            Ct = ct;
        }

        public String getAve() {
            return Ave;
        }

        public void setAve(String ave) {
            Ave = ave;
        }

        public String getFifty() {
            return fifty;
        }

        public void setFifty(String fifty) {
            this.fifty = fifty;
        }

        public String getSix_s() {
            return six_s;
        }

        public void setSix_s(String six_s) {
            this.six_s = six_s;
        }

        public String getFour_s() {
            return four_s;
        }

        public void setFour_s(String four_s) {
            this.four_s = four_s;
        }

        public String getSR() {
            return SR;
        }

        public void setSR(String SR) {
            this.SR = SR;
        }

        @SerializedName("5w")
        private String five_w;

        @SerializedName("4w")
        private String four_w;

        private String BBI;

        private String BBM;

        private String Wkts;

        private String Balls;

        private String Econ;

        @SerializedName("10")
        private String ten;

        public String getFive_w() {
            return five_w;
        }

        public void setFive_w(String five_w) {
            this.five_w = five_w;
        }

        public String getFour_w() {
            return four_w;
        }

        public void setFour_w(String four_w) {
            this.four_w = four_w;
        }

        public String getBBI() {
            return BBI;
        }

        public void setBBI(String BBI) {
            this.BBI = BBI;
        }

        public String getBBM() {
            return BBM;
        }

        public void setBBM(String BBM) {
            this.BBM = BBM;
        }

        public String getWkts() {
            return Wkts;
        }

        public void setWkts(String wkts) {
            Wkts = wkts;
        }

        public String getBalls() {
            return Balls;
        }

        public void setBalls(String balls) {
            Balls = balls;
        }

        public String getEcon() {
            return Econ;
        }

        public void setEcon(String econ) {
            Econ = econ;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }
    }

    public class T20Is {
        private String St;

        private String NO;

        private String Mat;

        private String BF;

        private String Inns;

        private String HS;

        private String Runs;

        @SerializedName("100")
        private String hundred;

        private String Ct;

        private String Ave;

        @SerializedName("50")
        private String fifty;

        @SerializedName("6s")
        private String six_s;

        @SerializedName("4s")
        private String four_s;

        private String SR;

        public String getSt() {
            return St;
        }

        public void setSt(String st) {
            St = st;
        }

        public String getNO() {
            return NO;
        }

        public void setNO(String NO) {
            this.NO = NO;
        }

        public String getMat() {
            return Mat;
        }

        public void setMat(String mat) {
            Mat = mat;
        }

        public String getBF() {
            return BF;
        }

        public void setBF(String BF) {
            this.BF = BF;
        }

        public String getInns() {
            return Inns;
        }

        public void setInns(String inns) {
            Inns = inns;
        }

        public String getHS() {
            return HS;
        }

        public void setHS(String HS) {
            this.HS = HS;
        }

        public String getRuns() {
            return Runs;
        }

        public void setRuns(String runs) {
            Runs = runs;
        }

        public String getHundred() {
            return hundred;
        }

        public void setHundred(String hundred) {
            this.hundred = hundred;
        }

        public String getCt() {
            return Ct;
        }

        public void setCt(String ct) {
            Ct = ct;
        }

        public String getAve() {
            return Ave;
        }

        public void setAve(String ave) {
            Ave = ave;
        }

        public String getFifty() {
            return fifty;
        }

        public void setFifty(String fifty) {
            this.fifty = fifty;
        }

        public String getSix_s() {
            return six_s;
        }

        public void setSix_s(String six_s) {
            this.six_s = six_s;
        }

        public String getFour_s() {
            return four_s;
        }

        public void setFour_s(String four_s) {
            this.four_s = four_s;
        }

        public String getSR() {
            return SR;
        }

        public void setSR(String SR) {
            this.SR = SR;
        }

        @SerializedName("5w")
        private String five_w;

        @SerializedName("4w")
        private String four_w;

        private String BBI;

        private String BBM;

        private String Wkts;

        private String Balls;

        private String Econ;

        @SerializedName("10")
        private String ten;

        public String getFive_w() {
            return five_w;
        }

        public void setFive_w(String five_w) {
            this.five_w = five_w;
        }

        public String getFour_w() {
            return four_w;
        }

        public void setFour_w(String four_w) {
            this.four_w = four_w;
        }

        public String getBBI() {
            return BBI;
        }

        public void setBBI(String BBI) {
            this.BBI = BBI;
        }

        public String getBBM() {
            return BBM;
        }

        public void setBBM(String BBM) {
            this.BBM = BBM;
        }

        public String getWkts() {
            return Wkts;
        }

        public void setWkts(String wkts) {
            Wkts = wkts;
        }

        public String getBalls() {
            return Balls;
        }

        public void setBalls(String balls) {
            Balls = balls;
        }

        public String getEcon() {
            return Econ;
        }

        public void setEcon(String econ) {
            Econ = econ;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }
    }

    
}
