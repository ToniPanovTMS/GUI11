import java.io.IOException;
import javax.swing.*;

public class GUI11 {
    public static void main(String[] args) throws IOException {
        String mane=JOptionPane.showInputDialog(null,"Введите имя");
        JOptionPane.showMessageDialog(null, mane);
    }
}