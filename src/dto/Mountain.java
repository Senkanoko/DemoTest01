package dto;

import mylib.Validation;

/**
 *
 * @author Senkanoko
 */
public class Mountain {
    private String code;
    private String name;
    private String loc;
    private String desc;
    
    public Mountain(){
        this.code = "";
        this.name = "";
        this.loc = "";
        this.desc = "";
    }

    public Mountain(String code, String name, String location, String desc ) {
        this.code = code;
        this.name = name;
        this.loc = location;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if(code.matches(Validation.mountainCodePattern))
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.matches(Validation.mountainNamePattern))
        this.name = name;
    }

    public String getLocation() {
        return loc;
    }

    public void setLocation(String location) {
        this.loc = location;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
            
    @Override
    public String toString(){
        return String.format("Mountain(code=%s, name=%s, loc=%s, desc=%s)", code, name, loc, desc);
    }
}
