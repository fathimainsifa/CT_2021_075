package Q_4;
import java.text.SimpleDateFormat;
import java.util.*;

public class Number4{
    public static void main(String[] args) {

        Date today;
        SimpleDateFormat sdf;
        today = new Date( );
        sdf = new SimpleDateFormat("dd MMM yyyy");
        System.out.println(sdf.format(today));
    }
}


