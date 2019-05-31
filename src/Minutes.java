import javax.swing.*;
import java.time.LocalTime;

public class Minutes implements Runnable{
    JLabel min;
    String minutes;

    public Minutes(){
        min = new JLabel();
    }


    @Override
    public void run() {
        while(true){
            minutes = "" + LocalTime.now().getMinute() + " :";
            if(LocalTime.now().getMinute() < 10){
                minutes = "0" + LocalTime.now().getMinute() + " :";
            }
            min.setText(minutes);
        }
    }
}
