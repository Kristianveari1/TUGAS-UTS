package model;

import Db.Db;
import Node.*;

public class ModelTransaksi {
    public void create(String peminjam, NodeBuku buku){
        NodeTransaksi transaksiBaru = new NodeTransaksi();
        transaksiBaru.setNama(peminjam);
        transaksiBaru.setBuku(buku);

        Db.transaksi.add(transaksiBaru);
    }
}
