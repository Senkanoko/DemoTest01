package mylib;

import java.util.Scanner;

/**
 *
 * @author Senkanoko
 */
public class Inputter {
    //Nhap 1 chuoi tu ban phim
    //Kiem tra chuoi vua nhap thoa man 1 chuoi mau
    //Tra ve chuoi da nhap sau khi kiem tra
    public static String inputString(String pattern) throws Exception{
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(!str.matches(pattern)){
            throw new Exception(); 
        }
        return str;
    }
}
