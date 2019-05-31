import javax.swing.*;
import java.awt.*;

public class ClockMain extends JFrame {
    FlowLayout fl;

    public static void main(String[] args){
        new ClockMain();
    }

    public ClockMain(){
        super("Clock");
        fl = new FlowLayout(FlowLayout.CENTER);
        Font font = new Font("Verdana", Font.BOLD, 25);
        this.setSize(400, 200);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(fl);

        Hours hr = new Hours();
        Minutes min = new Minutes();
        Seconds sec = new Seconds();
        Thread hours = new Thread(hr);
        Thread minutes = new Thread(min);
        Thread seconds = new Thread(sec);

        hr.hr.setFont(font);
        min.min.setFont(font);
        sec.sec.setFont(font);

        this.add(hr.hr);
        this.add(min.min);
        this.add(sec.sec);

        hours.start();
        minutes.start();
        seconds.start();
    }
}
