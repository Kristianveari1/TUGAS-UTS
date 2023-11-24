package Controller;

import Node.NodeBuku;
import model.ModelBuku;

import java.util.ArrayList;

public class ControllerBuku {
    ModelBuku modelBuku = new ModelBuku();

    public ArrayList<NodeBuku> lihatSemuaBuku(){
        return modelBuku.find();
    }
}