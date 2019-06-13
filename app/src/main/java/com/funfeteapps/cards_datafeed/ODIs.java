package com.funfeteapps.cards_datafeed;

import com.google.gson.annotations.SerializedName;

public class ODIs {
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


    // Batting variables
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
