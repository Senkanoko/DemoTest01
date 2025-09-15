package dto;

import mylib.Validation;

/**
 *
 * @author Senkanoko
 */
public class Student {
    private String id;
    private String name;
    private String phone;
    private String email;
    private String mCode;//1 mountain co 1 hoac nhieu sv dang ki
    private String cCode;//1 campus co 1 hoac nhieu sv
    private double tFee;//phu thuoc vao so dien thoai
    
    public Student() {
        this.id = "";
        this.name = "";
        this.phone = "";
        this.email = "";
        this.mCode = "";
        this.cCode = "";
        this.tFee = 6000000.0;
    }

    public Student(String id, String name, String phone, String email, String mCode, String cCode, double tFee) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.mCode = mCode;
        this.cCode = cCode;
        this.tFee = tFee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMountainCode() {
        return mCode;
    }

    public void setMountainCode(String mCode) {
        this.mCode = mCode;
    }
    
    public String getCampusCode() {
        return cCode;
    }

    public void setCampusCode(String cCode) {
        this.cCode = cCode;
    }

    public double getTutionFee() {
        return tFee;
    }

    public double setTutionFee(double tFee) {
        if(phone.matches(Validation.studentPhonePattern)&&phone.matches(Validation.viettelValid)||phone.matches(Validation.vnptValid)){
            this.tFee=0.35*tFee;
        }
        return this.tFee;
    }
    
    @Override
    public String toString(){
        return String.format("%s, %s, %s, %s, %s, %.2f", id, name, phone, email, mCode, getTutionFee());
    }
}
