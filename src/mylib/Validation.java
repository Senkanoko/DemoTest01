package mylib;

/**
 *
 * @author Senkanoko
 */
public interface Validation {
    public final String mountainCodePattern="^[0-9]+$";
    public final String mountainNamePattern="^[a-zA-Z0-9 ]+$";
    public final String campusCodePattern="^[SHQDC][E]$";
    public final String campusNamePattern="^[a-zA-Z ]+$";
    public final String studentIdPattern="^[SHQDC][E]\\d{6}$";
    public final String studentNamePattern="^[a-zA-Z ][2,20]$";
    public final String studentEmailPattern="^[a-zA-Z0-9 ]+[@]([a-zA-Z]+)[.][a-zA-Z]$";
    public final String studentPhonePattern="^0\\d{9}$";
    public final String viettelValid="^(032|033|034|035|036|037|038|039|096|097|098|086)\\d{7}$";
    public final String vnptValid="^(081|082|083|084|085|088|091|094)\\d{7}$";
}
