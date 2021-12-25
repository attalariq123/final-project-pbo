package DRIVER;

import CONTROLLER.*;
import MODEL.*;
import VIEW.*;
import com.formdev.flatlaf.intellijthemes.FlatHiberbeeDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.*;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainDriver {
    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(new FlatHiberbeeDarkIJTheme());
            UserModel m = new UserModel("", "");
            LoginForm v = new LoginForm();
            LoginController c = new LoginController(m, v);
            c.initController();
          } catch (UnsupportedLookAndFeelException e) {
              System.out.println(e);
          }
    }
}
