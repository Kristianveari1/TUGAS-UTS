package Controller;

import Node.NodeAdmin;
import model.ModelAdmin;

public class ControllerAdmin {

    ModelAdmin modelAdmin = new ModelAdmin();

    public NodeAdmin login( String username, String password )
    {
        NodeAdmin credentials = this.modelAdmin.findOne( username );

        if( credentials != null ){
            if( credentials.getPassword().equals( password ) ) return credentials;
        }

        return null;
    }
}
