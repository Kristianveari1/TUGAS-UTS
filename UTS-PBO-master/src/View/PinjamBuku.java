package View;

import Controller.ControllerTransaksi;

import java.util.Scanner;

public class PinjamBuku {

    public static void view() {
        Scanner input = new Scanner(System.in);
        ControllerTransaksi transaksiController = new ControllerTransaksi();

        System.out.println("-----------------------------------------");
        System.out.println("               Pinjam Buku               ");
        System.out.println("-----------------------------------------");
        System.out.print("Masukan nama peminjam : ");
        String namaPeminjam = input.nextLine();
        System.out.println("Masukan judul buku yang di pinjam : ");
        String judulBuku = input.nextLine();
        System.out.println("-----------------------------------------");

        System.out.println(
                transaksiController.PeminjamanBuku( namaPeminjam, judulBuku )
        );

    }
}