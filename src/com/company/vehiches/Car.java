package com.company.vehiches;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String markaAvto;
    private String klassAvto;
    private String vesAvto;
    private Driver vod;
    private Engine motor;

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public Car(String markaAvto, String klassAvto, String vesAvto, Driver vod, Engine motor) {
        this.markaAvto = markaAvto;
        this.klassAvto = klassAvto;
        this.vesAvto = vesAvto;
        this.vod = vod;
        this.motor = motor;
    }

    public String getMarkaAvto() {
        return markaAvto;
    }

    public void setMarkaAvto(String markaAvto) {
        this.markaAvto = markaAvto;
    }

    public String getKlassAvto() {
        return klassAvto;
    }

    public void setKlassAvto(String klassAvto) {
        this.klassAvto = klassAvto;
    }

    public String getVesAvto() {
        return vesAvto;
    }

    public void setVesAvto(String vesAvto) {
        this.vesAvto = vesAvto;
    }

    public Driver getVod() {
        return vod;
    }

    public void setVod(Driver vod) {
        this.vod = vod;
    }

    public Engine getMotor() {
        return motor;
    }

    public void setMotor(Engine motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "markaAvto='" + markaAvto + '\'' +
                ", klassAvto='" + klassAvto + '\'' +
                ", vesAvto=" + vesAvto +
                ", vod=" + vod +
                ", motor=" + motor +
                '}';
    }
}