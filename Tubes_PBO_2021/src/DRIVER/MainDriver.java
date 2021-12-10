package DRIVER;

import CONTROLLER.*;
import MODEL.*;
import VIEW.*;

public class MainDriver {
    public static void main(String[] args) {
        UserModel m = new UserModel("", "");
        LoginForm v = new LoginForm();
        LoginControl c = new LoginControl(m, v);
        c.initController();
        // Ini tambahan line
    }
}
