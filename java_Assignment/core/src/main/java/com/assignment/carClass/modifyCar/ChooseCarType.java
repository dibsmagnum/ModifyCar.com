package com.assignment.carClass.modifyCar;

import org.springframework.stereotype.Component;

@Component
public class ChooseCarType {
    private String chooseCar;

    public String getChooseCar() {
        return chooseCar;
    }

    public void setChooseCar(String chooseCar) {
        this.chooseCar = chooseCar;
    }
    
}
