import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

public class GUI11 {
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("кино");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(dim.width / 2 - 100 / 2, dim.height / 2 - 100 / 2, 100, 100);
        JPanel panel = new JPanel();
        panel.setFocusable(true);
        frame.add(panel);
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                int key = e.getKeyChar();
                if (key == 32) {
                    int result2=0,result3=0;

                    String name=JOptionPane.showInputDialog(null,"Введите имя");
                    JOptionPane.showMessageDialog(null, name);
                    int result1=JOptionPane.showConfirmDialog(null, "2+2=5?");
                    if(result1 == JOptionPane.YES_OPTION){
                        result2=JOptionPane.showConfirmDialog(null, "ты дурак?");
                    } else if (result1 == JOptionPane.NO_OPTION) {
                        result3=JOptionPane.showConfirmDialog(null, "а с маской спишь?");
                    }
                    if(result1==JOptionPane.YES_OPTION){
                        if(result2==JOptionPane.YES_OPTION){
                            JOptionPane.showMessageDialog(null, name+" До ужаса тупой, так ещё и знает это....");
                        } else if (result2==JOptionPane.NO_OPTION) {
                            JOptionPane.showMessageDialog(null, name+" Мало того, что тупой, так ещё и не признается....");
                        }
                    } else if (result1==JOptionPane.NO_OPTION) {
                        if(result3==JOptionPane.YES_OPTION){
                            JOptionPane.showMessageDialog(null, name+" Вроде не дурак, но с мамкой спит(возможно с твоей)");
                        } else if (result3==JOptionPane.NO_OPTION) {
                            JOptionPane.showMessageDialog(null, name+" Мдээээ, мне даже не о чём с тобой разговаривать....");
                        }
                    }


                }
            }
        });
        frame.setVisible(true);

    }
}