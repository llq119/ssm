package com.zking.ssm.llq.model;

public class Menu {
    private Integer mid;

    private String kname;

    private String cyname;

    private String complaint;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getKname() {
        return kname;
    }

    public void setKname(String kname) {
        this.kname = kname == null ? null : kname.trim();
    }

    public String getCyname() {
        return cyname;
    }

    public void setCyname(String cyname) {
        this.cyname = cyname == null ? null : cyname.trim();
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint == null ? null : complaint.trim();
    }
}