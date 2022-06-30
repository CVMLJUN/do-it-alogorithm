import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class P10699 {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date = ZonedDateTime.now(ZoneId.of("Asia/Seoul")).format(formatter);
        System.out.println(date);

        /*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date = LocalDate.now().format(formatter);
        //System.out.println(LocalDate.ofInstant());
        System.out.println(date);*/
    }
}
