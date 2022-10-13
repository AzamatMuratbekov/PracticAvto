package com.company.details;

public class Engine {
    private String moshnost;
    private String proizvoditel;

    public Engine(String moshnost, String proizvoditel) {
        this.moshnost = moshnost;
        this.proizvoditel = proizvoditel;
    }

    public String getMoshnost() {
        return moshnost;
    }

    public void setMoshnost(String moshnost) {
        this.moshnost = moshnost;
    }

    public String getProizvoditel() {
        return proizvoditel;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "moshnost=" + moshnost +
                ", proizvoditel='" + proizvoditel + '\'' +
                '}';
    }
}
