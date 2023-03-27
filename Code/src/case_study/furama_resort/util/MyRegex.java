package case_study.furama_resort.util;

public class MyRegex {
    // ** Mã Dịch Vụ **
    public static final String REGEX_VILLA_ID = "^SVVL-[0-9]{4}$";
    public static final String REGEX_HOUSE_ID = "^SVHO-[0-9]{4}$";
    public static final String REGEX_ROOM_ID = "^SVRO-[0-9]{4}$";

    // ** Tên Dịch Vụ **
    public static final String REGEX_SERVICE_NAME = "^[A-Z][a-z]*$";

    // ** Loại Thuê **
    public static final String REGEX_RENT_TYPE = "^[A-Z][a-z]*\\s[A-Z][a-z]*$";
}
