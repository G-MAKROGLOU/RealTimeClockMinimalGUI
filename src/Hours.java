import javax.swing.*;
import java.time.LocalTime;

public class Hours implements Runnable {
    JLabel hr;

    public Hours(){
        hr = new JLabel();
    }

    @Override
    public void run() {
        while(true){
            hr.setText("" + LocalTime.now().getHour() + " :");
        }
    }
}
