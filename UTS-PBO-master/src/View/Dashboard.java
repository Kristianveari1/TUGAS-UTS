package View;

import Node.NodeAdmin;

import java.util.Scanner;

public class Dashboard {
    public static void view() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("-----------------------------------------");
            System.out.println("                 DASHBOARD               ");
            System.out.println("-----------------------------------------");
            System.out.println("1. Pinjam buku");
            System.out.println("2. Lihat semua buku");
            System.out.println("3. Lihat semua admin");
            System.out.println("4. Logout");
            System.out.println("-----------------------------------------");
            System.out.print("Masukkan pilihan cth(2) : ");

            int pilihan = input.nextInt();

            if( pilihan == 1 ) PinjamBuku.view();
            else if( pilihan == 2 ) LihatSemuaBuku.view();
            else if ( pilihan == 3 ) LihatSemuaAdmin.view();
            else break;

        }


    }
}
