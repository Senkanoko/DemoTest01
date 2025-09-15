package service;

import java.util.ArrayList;
import dto.Mountain;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Senkanoko
 */
public class MountainList {

    ArrayList<Mountain> list;

    public MountainList() {
        list = new ArrayList<>();
    }
    //ham nay doc textfile "MountainList.csv"
    // luu data doc duoc vao arraylist

    /*public Mountain get(String mountainCode) {
        for(Mountain m: list){
            if(m.getCode().equalsIgnoreCase(mountainCode))
                return m;
        }
        return null;
    }*/
    
    public boolean isValidMountainCode(String mountainCode){
        return findMountain(mountainCode)!=null;
    }

    public void readDataFromFile(String filename) {//ham nay in ra man hinh list
        FileReader f = null;
        BufferedReader r = null;
        try {
            f = new FileReader(filename);
            r = new BufferedReader(f);
            r.readLine();//bo dong header trong file can doc
            while (r.ready()) {
                String s = r.readLine();
                String[] result = s.split(",");
                if (result.length == 4) {
                    String code = result[0];
                    String name = result[1];
                    String location = result[2];
                    String desc = result[3];
                    Mountain m = new Mountain(code, name, location, desc);
                    list.add(m);
                }
            }
        } catch (Exception e) {
            System.out.println("Filename is invalid!");
        } finally {
            try {
                if (f != null) {
                    f.close();
                }
                if (r != null) {
                    r.close();
                }
            } catch (Exception e) {
                System.out.println("ERROR: Cannot close file!");
            }
        }
    }
    
    public Mountain findMountain(String code){
        for(Mountain m: list){
            if(m.getCode().equalsIgnoreCase(code))
                return m;
        }
        return null;
    }

    public void DisplayAll() {
        if (list.isEmpty()) {
            System.out.println("Mountain list is empty!");
        }
        for (Mountain m : list) {
            System.out.println(m);
        }
    }
}
