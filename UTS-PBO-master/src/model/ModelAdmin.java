package model;

import Db.Db;
import Node.*;

import java.util.ArrayList;

public class ModelAdmin {

    public NodeAdmin findOne(String username)
    {
        for (NodeAdmin admin : Db.admins) {

            if( admin.getUsername().equals(username) ) return admin;
        }

        return null;
    }

    public ArrayList<NodeAdmin> find(){
        return Db.admins;
    }
}
