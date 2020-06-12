package com.byd.emg.pojo;

public class ZCNIORDERPLWT {
    private Integer plwtid;

    private String aufnr;

    private String vornr;

    private String pernr;

    private String nachn;

    private String vorna;

    private String arbei;

    private String arbeh;

    private String erdat;

    private String aedat;

    private String remark;

    public Integer getPlwtid() {
        return plwtid;
    }

    public void setPlwtid(Integer plwtid) {
        this.plwtid = plwtid;
    }

    public String getAufnr() {
        return aufnr;
    }

    public void setAufnr(String aufnr) {
        this.aufnr = aufnr == null ? null : aufnr.trim();
    }

    public String getVornr() {
        return vornr;
    }

    public void setVornr(String vornr) {
        this.vornr = vornr == null ? null : vornr.trim();
    }

    public String getPernr() {
        return pernr;
    }

    public void setPernr(String pernr) {
        this.pernr = pernr == null ? null : pernr.trim();
    }

    public String getNachn() {
        return nachn;
    }

    public void setNachn(String nachn) {
        this.nachn = nachn == null ? null : nachn.trim();
    }

    public String getVorna() {
        return vorna;
    }

    public void setVorna(String vorna) {
        this.vorna = vorna == null ? null : vorna.trim();
    }

    public String getArbei() {
        return arbei;
    }

    public void setArbei(String arbei) {
        this.arbei = arbei == null ? null : arbei.trim();
    }

    public String getArbeh() {
        return arbeh;
    }

    public void setArbeh(String arbeh) {
        this.arbeh = arbeh == null ? null : arbeh.trim();
    }

    public String getErdat() {
        return erdat;
    }

    public void setErdat(String erdat) {
        this.erdat = erdat == null ? null : erdat.trim();
    }

    public String getAedat() {
        return aedat;
    }

    public void setAedat(String aedat) {
        this.aedat = aedat == null ? null : aedat.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}