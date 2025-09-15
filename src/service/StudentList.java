package service;

import dto.Mountain;
import java.util.ArrayList;
import mylib.Inputter;
import mylib.Validation;
import dto.Student;

/**
 *
 * @author Senkanoko
 */
public class StudentList {

    ArrayList<Student> list;

    public StudentList() {
        list = new ArrayList<>();
    }

    //Them 1 sv vao list
    public boolean addStudent(MountainList m) {
        boolean cont = false;
        do {
            try {
                Student stu = new Student();
                String id = "";
                do {
                    System.out.println("Enter student ID:");
                    id = Inputter.inputString(Validation.studentIdPattern);
                } while (findStudent(id) != null);
                System.out.println("Enter student name:");
                String name = Inputter.inputString(Validation.studentNamePattern);
                System.out.println("Enter student email:");
                String email = Inputter.inputString(Validation.studentEmailPattern);
                System.out.println("Enter student phone:");
                String phone = Inputter.inputString(Validation.studentPhonePattern);
                Mountain find = null;
                String code;
                do {
                    System.out.println("Enter mountain code:");
                    code = Inputter.inputString(Validation.mountainCodePattern);
                    find = m.findMountain(code);
                } while (find == null);
                double fee = 6000000.0;
                if (phone.startsWith("03") || phone.startsWith("08")) {
                    fee = fee * 0.65;
                }
                System.out.println("Enter campus code: ");
                String cCode = Inputter.inputString(Validation.campusCodePattern);
                stu.setId(id);
                stu.setName(name);
                stu.setEmail(email);
                stu.setPhone(phone);
                stu.setCampusCode(cCode);
                stu.setMountainCode(code);
                list.add(stu);
                cont = false;
                return true;
            } catch (Exception e) {
                System.out.println("Invalid student!");
                cont = true;
            }
        }while(cont);
        return false;
    }

    public void displayStudent() {
        for (Student s : list) {
            System.out.println(s);
        }
    }

    //find student
    public Student findStudent(String id) {
        for (Student s : list) {
            if (s.getId().equals(id)) return s;
        }
        return null;
    }

    public boolean updateStudent() {
        String sId = "";
        try {
            System.out.println("Enter student ID: ");
            sId = Inputter.inputString(sId);
            Student find=findStudent(sId);
            if (find == null) {
                return false;
            }
            else{
                
                
                return true;
            }
        }catch(Exception e){
            System.out.println("Data invalid!");
        }
        return false;
    }

    public boolean deleteStudent() {
        String sId = "";
        try {
            System.out.println("Enter student ID: ");
            sId=Inputter.inputString(sId);
            Student find=findStudent(sId);
            if(find==null){
                System.out.println("Student not fuound!");
                return false;
            }else{
                
                
                
                return true;
            }
        }catch(Exception e){
            System.out.println("Data invalid!");
        }
        return false;
    }
}
