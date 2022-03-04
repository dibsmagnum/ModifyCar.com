package com.assignment.carClass.modifyCar;

import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CarTypeColor {
    Scanner input=new Scanner(System.in);
    @Autowired
    @Qualifier(value = "chooseCarType")
    private ChooseCarType chooseCarType;
    @Autowired
    @Qualifier(value="color")
    private Color color;
    @Autowired
    @Qualifier(value = "tyre")
    private Tyre tyre;
    @Autowired
    @Qualifier(value="seat")
    private Seat seat;
    public void showCarModifyColor(){
        System.out.println("Recommonded Color of the Car: ");
        System.out.println("Type 1: Red");
        System.out.println("Type 2: Green");
        System.out.println("Type 3: Yellow");
        System.out.println("Type 4: Pick Your Own Color ");
        int selection =input.nextInt();
        switch(selection){
            case 1:{
                color.setChooseColor("Red");
                showCarModifyTyre();
                break;
            }
            case 2:{
                color.setChooseColor("Green");
                showCarModifyTyre();
                break;
            }
            case 3:{
                color.setChooseColor("Yellow");
                showCarModifyTyre();
                break;
            }
            case 4:{
                String colorType=input.next();
                color.setChooseColor(colorType);
                showCarModifyTyre();
                break;
            }
            default:{
                System.out.println("Invalid Choice"+"\n"+"Choose the right Option");
                showCarModifyColor();
                break;
            }
        }
    }
    public void showCarModifyTyre(){
        System.out.println("Recommonded Tyre of the Car: ");
        System.out.println("Type 1: Ceat");
        System.out.println("Type 2: MRF");
        System.out.println("Type 3: Apollo Tyre");
        System.out.println("Type 4: Pick Your Own Tyre ");
        int selection =input.nextInt();
        switch(selection){
            case 1:{
                tyre.setChooseTyre("Ceat");
                showCarModifySeat();
                break;
            }
            case 2:{
                tyre.setChooseTyre("MRF");
                showCarModifySeat();
                break;
            }
            case 3:{
                tyre.setChooseTyre("Apollo Tyre");
                showCarModifySeat();
                break;
            }
            case 4:{
                String tyreType=input.next();
                tyre.setChooseTyre(tyreType);
                showCarModifySeat();
                break;
            }
            default:{
                System.out.println("Invalid Choice"+"\n"+"Choose the right Option");
                showCarModifyTyre();
                break;
            }
        }
    }
    public void showCarModifySeat(){
        System.out.println("Recommonded Engine of the Car: ");
        System.out.println("Type 1: Maruti Engine");
        System.out.println("Type 2: Hyundai Engine");
        System.out.println("Type 3: Honda Engine");
        System.out.println("Type 4: Pick Your Own Engine ");
        int selection =input.nextInt();
        switch(selection){
            case 1:{
                seat.setChooseSeat("Maruti Engine");
                System.out.println(toStringShow());
                break;
            }
            case 2:{
                seat.setChooseSeat("Hyundai Engine");
                System.out.println(toStringShow());
                break;
            }
            case 3:{
                seat.setChooseSeat("Honda Engine");
                System.out.println(toStringShow());
                break;
            }
            case 4:{
                String engineType=input.next();
                seat.setChooseSeat(engineType);
                System.out.println(toStringShow());
                break;
            }
            default:{
                System.out.println("Invalid Choice "+"\n"+"Choose the right Option");
                showCarModifySeat();
                break;
            }
        }
    }
    public String toStringShow() {
        return "WoooWooo!!!! Your Car is Ready"+"\n"+"Picked Car: "+chooseCarType.getChooseCar()+" [Color : " + color.getChooseColor() + ", Tyre: " + tyre.getChooseTyre()+ ", Engine: " + seat.getChooseSeat() + "]"
        +"\n"+"Thank You for Visiting ... Come Again";
    }
}
