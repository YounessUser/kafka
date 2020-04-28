package ma.cdgk.cnss.error;

public enum  ErrorsEnum {

    F000("desc1"),
    F001("desc2"),
    F002("desc3");

    private String code = "";

    ErrorsEnum(String code){
        this.code = code;
    }

    public String toString(){
        return code;
    }
}
