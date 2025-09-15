package view;

import java.util.Scanner;
import service.CampusList;
import service.MountainList;
import service.StudentList;

/**
 *
 * @author Senkanoko
 */
public class App {

    public static void main(String[] args) {
        String filename = "MountainList.csv";
        MountainList mList = new MountainList();
        mList.readDataFromFile(filename);
        mList.DisplayAll();

        CampusList cList = new CampusList();
        cList.readDataFromKeyboard();
        cList.displayCampus();

        StudentList sList = new StudentList();
        int choice = 0;
        do {
            System.out.println("1. Add Student");
            System.out.println("2. Display List");
            System.out.print("Choice: ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (sList.addStudent(mList)) {
                        System.out.println("Added successful!");
                    }
                    break;
                case 2:
                    System.out.println("----------------Student List-----------------");
                    sList.displayStudent();
                    break;
            }
        } while (choice <= 9);
    }
}
