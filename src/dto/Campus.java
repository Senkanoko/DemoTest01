package dto;

/**
 *
 * @author Senkanoko
 */
public class Campus {
    private String code;
    private String name;
    
    public Campus() {
        this.code = "";
        this.name = "";
    }

    public Campus(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    /*public boolean isValidCode(){
        return code.equals("SE")||code.equals("HE")||code.equals("DE")||code.equals("CE")||code.equals("QE");
    }
    
    public String getCampusName(){
        switch(code){
            case "SE" -> {
                return "Ho Chi Minh";
            }
            case "HE" -> {
                return "Ha Noi";
            }
            case "DE" -> {
                return "Da Nang";
            }
            case "CE" -> {
                return "Can Tho";
            }
            case "QE" -> {
                return "Quy Nhon";
            }
        }
        return null;
    }*/
    
    @Override
    public String toString(){
        return String.format("%s, %s", code, name);
    }
}
