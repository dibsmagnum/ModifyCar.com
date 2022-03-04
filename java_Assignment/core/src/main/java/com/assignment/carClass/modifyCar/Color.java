package com.assignment.carClass.modifyCar;

import org.springframework.stereotype.Component;

@Component
public class Color {
    private String chooseColor;

    public String getChooseColor() {
        return chooseColor;
    }

    public void setChooseColor(String chooseColor) {
        this.chooseColor = chooseColor;
    }
    
}
