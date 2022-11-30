package com.daovietgiao.daovietgiao_bkt3;

public class Author {
    private int Thumb;
    private String Name;
    private String NamSinh;
    private String NamMat;

    public Author(int thumb, String name, String namSinh, String namMat) {
        Thumb = thumb;
        Name = name;
        NamSinh = namSinh;
        NamMat = namMat;
    }

    public int getThumb() {
        return Thumb;
    }

    public void setThumb(int thumb) {
        Thumb = thumb;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(String namSinh) {
        NamSinh = namSinh;
    }

    public String getNamMat() {
        return NamMat;
    }

    public void setNamMat(String namMat) {
        NamMat = namMat;
    }
}
