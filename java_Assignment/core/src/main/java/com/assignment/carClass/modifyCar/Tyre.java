package com.assignment.carClass.modifyCar;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
    private String chooseTyre;

    public String getChooseTyre() {
        return chooseTyre;
    }

    public void setChooseTyre(String chooseTyre) {
        this.chooseTyre = chooseTyre;
    }

}
