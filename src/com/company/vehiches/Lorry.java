package com.company.vehiches;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    public Lorry(String markaAvto, String klassAvto, String vesAvto, Driver vod, Engine motor) {
        super(markaAvto, klassAvto, vesAvto, vod, motor);
    }

    private String gruzoPodem;

    public Lorry(String markaAvto, String klassAvto, String vesAvto, Driver vod, Engine motor, String gruzoPodem) {
        super(markaAvto, klassAvto, vesAvto, vod, motor);
        this.gruzoPodem = gruzoPodem;
    }

    public String getGruzoPodem() {
        return gruzoPodem;
    }

    public void setGruzoPodem(String gruzoPodem) {
        this.gruzoPodem = gruzoPodem;
    }

    @Override
    public String toString() {
            return "Lorry{" +
                    "markaAvto='" + super.getMarkaAvto() + '\'' +
                    ", klassAvto='" + super.getKlassAvto() + '\'' +
                    ", vesAvto=" + super.getVesAvto() +
                    ", vod=" + super.getVod() +
                    ", motor=" + super.getMotor() +
                    "gruzoPodem='" + gruzoPodem + '\'' +
                    '}';
        }
    }
