package com.borrow.entity;

public class AreaInfo {
    private Integer areaid;

    private String areaname;

    private Integer parentid;

    private String arrparentid;

    private Boolean child;

    private Short listorder;

    private String arrchildid;

    public AreaInfo(Integer areaid, String areaname, Integer parentid, String arrparentid, Boolean child, Short listorder, String arrchildid) {
        this.areaid = areaid;
        this.areaname = areaname;
        this.parentid = parentid;
        this.arrparentid = arrparentid;
        this.child = child;
        this.listorder = listorder;
        this.arrchildid = arrchildid;
    }

    public AreaInfo() {
        super();
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getArrparentid() {
        return arrparentid;
    }

    public void setArrparentid(String arrparentid) {
        this.arrparentid = arrparentid == null ? null : arrparentid.trim();
    }

    public Boolean getChild() {
        return child;
    }

    public void setChild(Boolean child) {
        this.child = child;
    }

    public Short getListorder() {
        return listorder;
    }

    public void setListorder(Short listorder) {
        this.listorder = listorder;
    }

    public String getArrchildid() {
        return arrchildid;
    }

    public void setArrchildid(String arrchildid) {
        this.arrchildid = arrchildid == null ? null : arrchildid.trim();
    }
}