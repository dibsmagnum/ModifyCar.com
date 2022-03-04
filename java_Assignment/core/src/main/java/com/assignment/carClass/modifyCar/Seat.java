package com.assignment.carClass.modifyCar;

import org.springframework.stereotype.Component;

@Component
public class Seat {
    private String chooseSeat;

    public String getChooseSeat() {
        return chooseSeat;
    }

    public void setChooseSeat(String chooseSeat) {
        this.chooseSeat = chooseSeat;
    }
    
}
