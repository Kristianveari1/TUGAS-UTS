import Db.Db;
import Node.NodeAdmin;
import View.Login;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            NodeAdmin admin = new NodeAdmin();
            admin.setUsername("admin" + i);
            admin.setPassword("admin" + i);
            Db.admins.add( admin );
        }

        Login.view();
    }
}