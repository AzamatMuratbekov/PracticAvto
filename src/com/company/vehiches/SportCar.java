package com.company.vehiches;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    public SportCar(String markaAvto, String klassAvto, String vesAvto, Driver vod, Engine motor) {
        super(markaAvto, klassAvto, vesAvto, vod, motor);
    }
    private String predSkorost;

    public SportCar(String markaAvto, String klassAvto, String vesAvto, Driver vod, Engine motor, String predSkorost) {
        super(markaAvto, klassAvto, vesAvto, vod, motor);
        this.predSkorost = predSkorost;
    }

    public String getPredSkorost() {
        return predSkorost;
    }

    public void setPredSkorost(String predSkorost) {
        this.predSkorost = predSkorost;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "markaAvto='" + super.getMarkaAvto() + '\'' +
                ", klassAvto='" + super.getKlassAvto() + '\'' +
                ", vesAvto=" + super.getVesAvto() +
                ", vod=" + super.getVod() +
                ", motor=" + super.getMotor() +
                "predSkorost='" + predSkorost + '\'' +
                '}';
    }
}
