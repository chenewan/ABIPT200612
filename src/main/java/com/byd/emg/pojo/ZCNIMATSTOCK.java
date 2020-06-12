package com.byd.emg.pojo;

public class ZCNIMATSTOCK {
    private Integer stockid;

    private String matnr;

    private String werks;

    private String bwtar;

    private String lvorm;

    private String lbkum;

    private String stprs;

    private String ersda;

    private String laeda;

    private String remark;

    public Integer getStockid() {
        return stockid;
    }

    public void setStockid(Integer stockid) {
        this.stockid = stockid;
    }

    public String getMatnr() {
        return matnr;
    }

    public void setMatnr(String matnr) {
        this.matnr = matnr == null ? null : matnr.trim();
    }

    public String getWerks() {
        return werks;
    }

    public void setWerks(String werks) {
        this.werks = werks == null ? null : werks.trim();
    }

    public String getBwtar() {
        return bwtar;
    }

    public void setBwtar(String bwtar) {
        this.bwtar = bwtar == null ? null : bwtar.trim();
    }

    public String getLvorm() {
        return lvorm;
    }

    public void setLvorm(String lvorm) {
        this.lvorm = lvorm == null ? null : lvorm.trim();
    }

    public String getLbkum() {
        return lbkum;
    }

    public void setLbkum(String lbkum) {
        this.lbkum = lbkum == null ? null : lbkum.trim();
    }

    public String getStprs() {
        return stprs;
    }

    public void setStprs(String stprs) {
        this.stprs = stprs == null ? null : stprs.trim();
    }

    public String getErsda() {
        return ersda;
    }

    public void setErsda(String ersda) {
        this.ersda = ersda == null ? null : ersda.trim();
    }

    public String getLaeda() {
        return laeda;
    }

    public void setLaeda(String laeda) {
        this.laeda = laeda == null ? null : laeda.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}