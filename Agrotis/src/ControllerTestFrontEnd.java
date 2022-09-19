package controller;

import model.ModelTestFrontEnd;
import DAO.DAOTestFrontEnd;
import java.util.ArrayList;

/**
*
* @author Jordana
*/
public class ControllerTestFrontEnd {

    private DAOTestFrontEnd daoTestFrontEnd = new DAOTestFrontEnd();

    /**
    * grava TestFrontEnd
    * @param pModelTestFrontEnd
    * @return int
    */
    public int salvarTestFrontEndController(ModelTestFrontEnd pModelTestFrontEnd){
        return this.daoTestFrontEnd.salvarTestFrontEndDAO(pModelTestFrontEnd);
    }

    /**
    * recupera TestFrontEnd
    * @param pNome
    * @return ModelTestFrontEnd
    */
    public ModelTestFrontEnd getTestFrontEndController(String pNome){
        return this.daoTestFrontEnd.getTestFrontEndDAO(pNome);
    }

    /**
    * recupera uma lista deTestFrontEnd
    * @param pNome
    * @return ArrayList
    */
    public ArrayList<ModelTestFrontEnd> getListaTestFrontEndController(){
        return this.daoTestFrontEnd.getListaTestFrontEndDAO();
    }

    /**
    * atualiza TestFrontEnd
    * @param pModelTestFrontEnd
    * @return boolean
    */
    public boolean atualizarTestFrontEndController(ModelTestFrontEnd pModelTestFrontEnd){
        return this.daoTestFrontEnd.atualizarTestFrontEndDAO(pModelTestFrontEnd);
    }

    /**
    * exclui TestFrontEnd
    * @param pNome
    * @return boolean
    */
    public boolean excluirTestFrontEndController(String pNome){
        return this.daoTestFrontEnd.excluirTestFrontEndDAO(pNome);
    }
}