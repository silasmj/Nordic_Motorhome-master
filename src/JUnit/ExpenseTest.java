import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class ExpenseTest {
    @Test
    public void test() throws ParseException {
        int full_price = 0;
        int fuel_level = 1;
        int drop_off_extras = 0;
        String rental_start_date = "2019-01-01";
        String rental_end_date = "2019-01-15";
            if(fuel_level > 0.5) {
                int x = full_price + 70;
                double z = drop_off_extras / 0.7;
                LocalDate localDate1 = LocalDate.parse(rental_start_date);
                LocalDate localDate2 = LocalDate.parse(rental_end_date);
                long noOfDaysDifference = ChronoUnit.DAYS.between(localDate1, localDate2);
                assertEquals(30, noOfDaysDifference);
            }
    }
}
