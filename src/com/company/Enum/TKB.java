package com.company.Enum;

public class TKB {
    private Day thu;
    private String cacMonHoc;

    public TKB(Day thu, String cacMonHoc) {
        this.thu = thu;
        this.cacMonHoc = cacMonHoc;
    }

    public Day getThu() {
        return thu;
    }

    public void setThu(Day thu) {
        this.thu = thu;
    }

    public String getCacMonHoc() {
        return cacMonHoc;
    }

    public void setCacMonHoc(String cacMonHoc) {
        this.cacMonHoc = cacMonHoc;
    }

    @Override
    public String toString() {
        return "TKB{" +
                "thu=" + thu +
                ", cacMonHoc='" + cacMonHoc + '\'' +
                '}';
    }

}
