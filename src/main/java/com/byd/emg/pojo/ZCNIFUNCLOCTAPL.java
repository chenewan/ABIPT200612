package com.byd.emg.pojo;

public class ZCNIFUNCLOCTAPL {
    private Integer taplid;

    private String tplnr;

    private String plnnr;

    private String plnal;

    private String loekz;

    private String iwerk;

    private String andat;

    private String aedat;

    private String remark;

    public Integer getTaplid() {
        return taplid;
    }

    public void setTaplid(Integer taplid) {
        this.taplid = taplid;
    }

    public String getTplnr() {
        return tplnr;
    }

    public void setTplnr(String tplnr) {
        this.tplnr = tplnr == null ? null : tplnr.trim();
    }

    public String getPlnnr() {
        return plnnr;
    }

    public void setPlnnr(String plnnr) {
        this.plnnr = plnnr == null ? null : plnnr.trim();
    }

    public String getPlnal() {
        return plnal;
    }

    public void setPlnal(String plnal) {
        this.plnal = plnal == null ? null : plnal.trim();
    }

    public String getLoekz() {
        return loekz;
    }

    public void setLoekz(String loekz) {
        this.loekz = loekz == null ? null : loekz.trim();
    }

    public String getIwerk() {
        return iwerk;
    }

    public void setIwerk(String iwerk) {
        this.iwerk = iwerk == null ? null : iwerk.trim();
    }

    public String getAndat() {
        return andat;
    }

    public void setAndat(String andat) {
        this.andat = andat == null ? null : andat.trim();
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