package DAO;

import model.ModelTestFrontEnd;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Jordana
*/
public class DAOTestFrontEnd extends ConexaoMySql {

    /**
    * grava TestFrontEnd
    * @param pModelTestFrontEnd
    * @return int
    */
    public int salvarTestFrontEndDAO(ModelTestFrontEnd pModelTestFrontEnd){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_clientes, tbl_laboratorios,  ("
                    + "nome,"
                    + "data_inicial,"
                    + "data_final,"
                    + "propriedades,"
                    + "laboratório,"
                    + "observações"
                + ") VALUES ("
                    + "'" + pModelTestFrontEnd.getNome() + "',"
                    + "'" + pModelTestFrontEnd.getData Inicial() + "',"
                    + "'" + pModelTestFrontEnd.getData Final() + "',"
                    + "'" + pModelTestFrontEnd.getPropriedades() + "',"
                    + "'" + pModelTestFrontEnd.getLaboratório() + "',"
                    + "'" + pModelTestFrontEnd.getObservações() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera TestFrontEnd
    * @param pNome
    * @return ModelTestFrontEnd
    */
    public ModelTestFrontEnd getTestFrontEndDAO(String pNome){
        ModelTestFrontEnd modelTestFrontEnd = new ModelTestFrontEnd();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "nome,"
                    + "data_inicial,"
                    + "data_final,"
                    + "propriedades,"
                    + "laboratório,"
                    + "observações"
                 + " FROM"
                     + " tbl_clientes, tbl_laboratorios, "
                 + " WHERE"
                     + " nome = '" + pNome + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelTestFrontEnd.setNome(this.getResultSet().getString(1));
                modelTestFrontEnd.setData Inicial(this.getResultSet().getString (2));
                modelTestFrontEnd.setData Final(this.getResultSet().getString(3));
                modelTestFrontEnd.setPropriedades(this.getResultSet().getString(4));
                modelTestFrontEnd.setLaboratório(this.getResultSet().getString(5));
                modelTestFrontEnd.setObservações(this.getResultSet().getString(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelTestFrontEnd;
    }

    /**
    * recupera uma lista de TestFrontEnd
        * @return ArrayList
    */
    public ArrayList<ModelTestFrontEnd> getListaTestFrontEndDAO(){
        ArrayList<ModelTestFrontEnd> listamodelTestFrontEnd = new ArrayList();
        ModelTestFrontEnd modelTestFrontEnd = new ModelTestFrontEnd();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "nome,"
                    + "data_inicial,"
                    + "data_final,"
                    + "propriedades,"
                    + "laboratório,"
                    + "observações"
                 + " FROM"
                     + " tbl_clientes, tbl_laboratorios, "
                + ";"
            );

            while(this.getResultSet().next()){
                modelTestFrontEnd = new ModelTestFrontEnd();
                modelTestFrontEnd.setNome(this.getResultSet().getString(1));
                modelTestFrontEnd.setData Inicial(this.getResultSet().getString (2));
                modelTestFrontEnd.setData Final(this.getResultSet().getString(3));
                modelTestFrontEnd.setPropriedades(this.getResultSet().getString(4));
                modelTestFrontEnd.setLaboratório(this.getResultSet().getString(5));
                modelTestFrontEnd.setObservações(this.getResultSet().getString(6));
                listamodelTestFrontEnd.add(modelTestFrontEnd);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelTestFrontEnd;
    }

    /**
    * atualiza TestFrontEnd
    * @param pModelTestFrontEnd
    * @return boolean
    */
    public boolean atualizarTestFrontEndDAO(ModelTestFrontEnd pModelTestFrontEnd){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_clientes, tbl_laboratorios,  SET "
                    + "nome = '" + pModelTestFrontEnd.getNome() + "',"
                    + "data_inicial = '" + pModelTestFrontEnd.getData Inicial() + "',"
                    + "data_final = '" + pModelTestFrontEnd.getData Final() + "',"
                    + "propriedades = '" + pModelTestFrontEnd.getPropriedades() + "',"
                    + "laboratório = '" + pModelTestFrontEnd.getLaboratório() + "',"
                    + "observações = '" + pModelTestFrontEnd.getObservações() + "'"
                + " WHERE "
                    + "nome = '" + pModelTestFrontEnd.getNome() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui TestFrontEnd
    * @param pNome
    * @return boolean
    */
    public boolean excluirTestFrontEndDAO(String pNome){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_clientes, tbl_laboratorios,  "
                + " WHERE "
                    + "nome = '" + pNome + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}