package zad2_9;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class zad2_9 {
    public static void main(String[] args) {
        System.out.println("Wciśnij klawisz od a do z.");

        char correctKey = generateRandomKey();

        JFrame frame = new JFrame();
        JLabel label = new JLabel();

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char pressedKey = e.getKeyChar();

                if (pressedKey == correctKey) {
                    label.setText("Dobrze!");
                    frame.dispose();
                } else {
                    label.setText("Źle!");

                    if (pressedKey < correctKey) {
                        label.setText(label.getText() + " Właściwy klawisz to wcześniejsza litera.");
                    } else {
                        label.setText(label.getText() + " Właściwy klawisz to dalsza litera.");
                    }
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }

    private static char generateRandomKey() {
        int randomNum = (int) (Math.random() * 26);
        return (char) ('a' + randomNum);
    }
}