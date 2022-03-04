package com.assignment.carClass;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.assignment.CarModification.carModify;
import com.assignment.carClass.modifyCar.CarTypeColor;
import com.assignment.carClass.modifyCar.ChooseCarType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car extends LoginPage implements carModify {
    Scanner sc = new Scanner(System.in);
    List<String> list=new LinkedList<String>();
    HashMap<String,Integer> map=new HashMap<String,Integer>();
    @Autowired
    @Qualifier(value = "chooseCarType")
    private ChooseCarType chooseCarType;
    @Autowired
    @Qualifier(value="carTypeColor")
    private CarTypeColor carTypeColor;
    public void getLogin() throws IOException {
        int x = 1;
        do {
            try {
                map.put("956323", 3351);
                map.put("798060", 8931);
                map.put("dibs", 1602);
                System.out.println("***************************Welcome to ModifyCar.com**********************");
                System.out.print("\n" + "Login Page "+"\n"+"Enter UserName or UserID ");
                setUserName(sc.next());
                System.out.print( "Enter Your 4 Digit Password ");
                setPassword(sc.nextInt());
            } catch (Exception e) {
                System.out.println("\n" + "Invalid Character" + "\n" );
                x = 2;
            }
            String cn = getUserName();
            int pn = getPassword();
            if (map.containsKey(cn) && map.get(cn) == pn) {
                modifyAll();
            } else {
                System.out.println("Wrong UserName or Password");
            }
        } while (x == 1);
    }
    @Override
    public void modifyAll() {
        list.add("Maruti");
        list.add("Hyundai");
        list.add("Honda");
        System.out.println(" Recommonded Car For You ");
        System.out.println("Type 1: Maruti");
        System.out.println("Type 2: Hyundai");
        System.out.println("Type 3: Honda");
        System.out.println("Type 4: Choose Your Own Car");
        String selection= sc.next();
        switch(selection){
            case "1":{
                chooseCarType.setChooseCar("Maruti");
                carTypeColor.showCarModifyColor();
                break;
            }
            case "2":{
                chooseCarType.setChooseCar("Hyundai");
                carTypeColor.showCarModifyColor();
                break;
            }
            case "3":{
                chooseCarType.setChooseCar("Honda");
                carTypeColor.showCarModifyColor();
                break;
            }
            case "4":{
                String chooseCar=sc.next();
                for(String i:list){
                    if(i.equals(chooseCar)){
                        System.out.println("Car is already Present "+"\n"+"Choose from Recommonded Section");
                        modifyAll();
                    }
                    else{
                        chooseCarType.setChooseCar(chooseCar);
                    }
                }
                carTypeColor.showCarModifyColor();
                break;
            }
            default:{
                System.out.println("Invalid choice"+"\n"+"Enter the Valid Cars");
                modifyAll();
                break;
            }
        }
    }
}
