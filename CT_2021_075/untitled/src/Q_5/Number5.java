package Q_5;
import java.text.SimpleDateFormat;
import java.util.*;


public class Number5 {
    public static void main(String[] args) {
        Date today;
        SimpleDateFormat sdf;
        today = new Date( );
        sdf = new SimpleDateFormat("EEEE, MMM dd,yyyy");
        System.out.println(sdf.format(today));
    }
}
