package com.byd.emg.pojo;

public class ZCNIMATCHAR {
    private Integer charid;

    private String matnr;

    private String class1;

    private String atnam;

    private String kschl;

    private String atbez;

    private String atwrt;

    private String ersda;

    private String laeda;

    private String remark;

    public Integer getCharid() {
        return charid;
    }

    public void setCharid(Integer charid) {
        this.charid = charid;
    }

    public String getMatnr() {
        return matnr;
    }

    public void setMatnr(String matnr) {
        this.matnr = matnr == null ? null : matnr.trim();
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1 == null ? null : class1.trim();
    }

    public String getAtnam() {
        return atnam;
    }

    public void setAtnam(String atnam) {
        this.atnam = atnam == null ? null : atnam.trim();
    }

    public String getKschl() {
        return kschl;
    }

    public void setKschl(String kschl) {
        this.kschl = kschl == null ? null : kschl.trim();
    }

    public String getAtbez() {
        return atbez;
    }

    public void setAtbez(String atbez) {
        this.atbez = atbez == null ? null : atbez.trim();
    }

    public String getAtwrt() {
        return atwrt;
    }

    public void setAtwrt(String atwrt) {
        this.atwrt = atwrt == null ? null : atwrt.trim();
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