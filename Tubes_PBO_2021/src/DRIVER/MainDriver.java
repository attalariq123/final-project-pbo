package DRIVER;

import CONTROLLER.*;
import MODEL.*;
import VIEW.*;
import com.formdev.flatlaf.intellijthemes.*;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainDriver {
    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(new FlatHiberbeeDarkIJTheme());
            AdminModel m = new AdminModel("", "");
            LoginForm v = new LoginForm();
            LoginController c = new LoginController(m, v);
            c.initController();
          } catch (UnsupportedLookAndFeelException e) {
              System.out.println(e);
          }
    }
}
