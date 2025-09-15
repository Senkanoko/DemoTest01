package service;

import java.util.ArrayList;
import dto.Campus;
import java.util.Scanner;
import mylib.Inputter;
import mylib.Validation;

/**
 *
 * @author Senkanoko
 */
public class CampusList {
    ArrayList<Campus> list;
    
    public CampusList(){
        list=new ArrayList<>();
    }
    //tao ds campus tu keyboard
    
    public void readDataFromKeyboard(){
        boolean cont=false;
        do{
            try{
            //nhap code,name cho campus
            System.out.print("Enter Campus Code: ");
            String code=Inputter.inputString(Validation.campusCodePattern);
            System.out.print("Enter Campus Name: ");
            String name=Inputter.inputString(Validation.campusNamePattern);
            //tao Campus object
            Campus m=new Campus(code, name);
            list.add(m);
                System.out.print("Add more(T|F)?= ");
                Scanner sc=new Scanner(System.in);
                cont=sc.nextBoolean();
            }catch(Exception e){
                System.out.println("Campus name is invalid!");
                cont=true;
            }
        }while(cont);
    }
    //In Campus ra man hinh
    public void displayCampus(){
        for(Campus campus: list){
            System.out.println(campus);
        }
    }
}
