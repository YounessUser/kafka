package ma.cdgk.cnss.error;

public class ErrorFormat {

    private String code;
    private String description;

    public ErrorFormat(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public ErrorFormat(ErrorsEnum error) {
        this.code = error.name();
        this.description = error.toString();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
