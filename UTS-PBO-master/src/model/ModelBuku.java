package model;

import Db.Db;
import Node.NodeBuku;

import java.util.ArrayList;

public class ModelBuku {
    int incKode = 1;

    public ArrayList<NodeBuku> find()
    {
        return Db.books;
    }

}