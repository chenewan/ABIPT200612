package com.byd.emg.pojo;

public class Lastvpo {
    private Integer id;

    private String vpono;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVpono() {
        return vpono;
    }

    public void setVpono(String vpono) {
        this.vpono = vpono == null ? null : vpono.trim();
    }
}