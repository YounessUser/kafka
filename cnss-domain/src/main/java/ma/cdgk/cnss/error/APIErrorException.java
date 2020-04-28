package ma.cdgk.cnss.error;

import ma.cdgk.cnss.error.ErrorFormat;
import ma.cdgk.cnss.error.ErrorsEnum;

public class APIErrorException extends RuntimeException {

    private ErrorFormat errorFormat;

    public APIErrorException(ErrorsEnum errorsEnum) {
        super();
        this.errorFormat = new ErrorFormat(errorsEnum.name(), errorsEnum.toString());
    }

    public APIErrorException(ErrorsEnum errorsEnum, String id) {
        super();
        this.errorFormat = new ErrorFormat(errorsEnum.name(), errorsEnum.toString() + " : " + id);
    }

    public ErrorFormat getErrorFormat() {
        return errorFormat;
    }

    public void setErrorFormat(ErrorFormat errorFormat) {
        this.errorFormat = errorFormat;
    }
}
