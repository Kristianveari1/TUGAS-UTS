package View;

import Controller.ControllerAdmin;

import java.util.Scanner;

public class Login {
    public static void view() {
        Scanner input = new Scanner(System.in);
        ControllerAdmin adminController = new ControllerAdmin();

        while (true) {

            System.out.println("-----------------------------------------");
            System.out.println("                  Login                  ");
            System.out.println("-----------------------------------------");
            System.out.print("Username : ");
            String username = input.nextLine();
            System.out.print("Password : ");
            String password = input.nextLine();
            System.out.println("-----------------------------------------");

            if( adminController.login(username, password) != null ) Dashboard.view();
            else System.out.println("Akun admin tidak di temukan");

        }

    }
}