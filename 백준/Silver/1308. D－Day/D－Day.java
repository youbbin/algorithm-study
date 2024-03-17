import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str_today = br.readLine();
        String str_end = br.readLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("y M d");
        LocalDate date_today = LocalDate.parse(str_today, formatter);
        LocalDate date_end = LocalDate.parse(str_end, formatter);
        long between_year = ChronoUnit.YEARS.between(date_today, date_end);
        long between_date = ChronoUnit.DAYS.between(date_today, date_end);
        if (between_year >= 1000) {
            System.out.println("gg");
        } else {
            System.out.println("D-" + between_date);
        }
        br.close();
    }
}