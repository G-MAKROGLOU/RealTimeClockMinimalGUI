import javax.swing.*;
import java.time.LocalTime;

public class Seconds implements Runnable {
    JLabel sec;
    String seconds;
    String meridium;

    public Seconds(){
        sec = new JLabel();
    }


    @Override
    public void run() {
        while(true) {
            meridium = " ";
            seconds = "" + LocalTime.now( ).getSecond( );
            if(LocalTime.now().getHour() > 12)
               meridium = "PM";
            else if(LocalTime.now().getHour() <= 12)
                meridium = "AM";

            if(LocalTime.now().getSecond() < 10)
                    seconds = "0" + LocalTime.now( ).getSecond( );

            sec.setText(seconds + " " + meridium);
            }
        }
    }

