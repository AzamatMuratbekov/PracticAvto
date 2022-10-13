package com.company.professions;

public class Driver extends Person{
    private String FIO;
    private String staj;

    public Driver(String FIO, String staj) {
        this.FIO = FIO;
        this.staj = staj;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getStaj() {
        return staj;
    }

    public void setStaj(String staj) {
        this.staj = staj;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "FIO='" + FIO + '\'' +
                ", staj=" + staj +
                '}';
    }
}
