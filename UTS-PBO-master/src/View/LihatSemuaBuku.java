package View;

import Controller.ControllerAdmin;
import Controller.ControllerBuku;
import Node.NodeBuku;

public class LihatSemuaBuku {
    public static void view() {
        ControllerBuku bukuController = new ControllerBuku();

        System.out.println("-----------------------------------------");
        System.out.println("            Lihat semua buku             ");
        System.out.println("-----------------------------------------");
        for (NodeBuku buku : bukuController.lihatSemuaBuku()) {
            System.out.println(buku.getKodeBuku());
            System.out.println(buku.getJudulBuku());
            System.out.println(buku.getPengarang());
            System.out.println(buku.getTahunTerbit());
            System.out.println(buku.getStok());
            System.out.println("-----------------------------------------");
        }
    }
}
