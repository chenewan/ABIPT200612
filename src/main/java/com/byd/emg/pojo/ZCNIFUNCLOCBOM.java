package com.byd.emg.pojo;

public class ZCNIFUNCLOCBOM {
    private Integer bomid;

    private String werks;

    private String tplnr;

    private String posnr;

    private String idnrk;

    private String menge;

    private String meins;

    private String andatTpst;

    private String aedatTpst;

    private String andatStpo;

    private String aedatStpo;

    private String remark;

    public Integer getBomid() {
        return bomid;
    }

    public void setBomid(Integer bomid) {
        this.bomid = bomid;
    }

    public String getWerks() {
        return werks;
    }

    public void setWerks(String werks) {
        this.werks = werks == null ? null : werks.trim();
    }

    public String getTplnr() {
        return tplnr;
    }

    public void setTplnr(String tplnr) {
        this.tplnr = tplnr == null ? null : tplnr.trim();
    }

    public String getPosnr() {
        return posnr;
    }

    public void setPosnr(String posnr) {
        this.posnr = posnr == null ? null : posnr.trim();
    }

    public String getIdnrk() {
        return idnrk;
    }

    public void setIdnrk(String idnrk) {
        this.idnrk = idnrk == null ? null : idnrk.trim();
    }

    public String getMenge() {
        return menge;
    }

    public void setMenge(String menge) {
        this.menge = menge == null ? null : menge.trim();
    }

    public String getMeins() {
        return meins;
    }

    public void setMeins(String meins) {
        this.meins = meins == null ? null : meins.trim();
    }

    public String getAndatTpst() {
        return andatTpst;
    }

    public void setAndatTpst(String andatTpst) {
        this.andatTpst = andatTpst == null ? null : andatTpst.trim();
    }

    public String getAedatTpst() {
        return aedatTpst;
    }

    public void setAedatTpst(String aedatTpst) {
        this.aedatTpst = aedatTpst == null ? null : aedatTpst.trim();
    }

    public String getAndatStpo() {
        return andatStpo;
    }

    public void setAndatStpo(String andatStpo) {
        this.andatStpo = andatStpo == null ? null : andatStpo.trim();
    }

    public String getAedatStpo() {
        return aedatStpo;
    }

    public void setAedatStpo(String aedatStpo) {
        this.aedatStpo = aedatStpo == null ? null : aedatStpo.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}