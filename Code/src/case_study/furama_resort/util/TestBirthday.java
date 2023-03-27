package case_study.furama_resort.util;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TestBirthday {
    public static boolean testBirthday(String birthday) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dateOfBirth = LocalDate.now();
        try {
            dateOfBirth = LocalDate.parse(birthday, formatter);
        } catch (DateTimeException e) {
            System.out.println("NGOẠI LỆ: SAI ĐỊNH DẠNG NGÀY (dd/MM/yyyy)");
            System.out.println("======= ==================================");
//            e.printStackTrace();
        }

        LocalDate botLimit = dateOfBirth.plusYears(18);
        LocalDate topLimit = dateOfBirth.plusYears(100);

//        Period period = Period.between(dateOfBirth, LocalDate.now());
//        return period.getYears() > 18 && period.getYears() < 100;

        return LocalDate.now().isAfter(botLimit) && LocalDate.now().isBefore(topLimit);
    }
}
