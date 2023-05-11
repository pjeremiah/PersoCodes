package TimerCountdown;
import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class JavaTimer {

    public static void main(String[] args) {
    JFrame jframe = new JFrame();
    TimerDisplay LabelTime = new TimerDisplay();

    jframe.setLayout(new FlowLayout());
    jframe.setBounds(500, 300, 400, 100);

    jframe.add(LabelTime);
    jframe.setVisible(true);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 300;
            public void run() {
                try {
                    int minutes = i / 60;
                    int seconds = i % 60;
                    LabelTime.setText("Timer Countdown: " + String.format("%02d:%02d", minutes, seconds));
                    i--;
        
                    if (i < 0) {
                        timer.cancel();
                        LabelTime.setText("You are terminated!, System Failure");
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println("Array index out of bounds: " + e.getMessage());
                }
            }
        }, 0, 1000);    

    }
}
