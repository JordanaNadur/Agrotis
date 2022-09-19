package model;
/**
*
* @author Jordana
*/
public class ModelTestFrontEnd {

    public String nome;
    public String  data inicial;
    public String data final;
    private String propriedades;
    private String laboratório;
    private String observações;

    /**
    * Construtor
    */
    public ModelTestFrontEnd(){}

    /**
    * seta o valor de nome
    * @param pNome
    */
    public void setNome(String pNome){
        this.nome = pNome;
    }
    /**
    * @return nome
    */
    public String getNome(){
        return this.nome;
    }

    /**
    * seta o valor de data inicial
    * @param pData Inicial
    */
    public void setData Inicial(String  pData Inicial){
        this.data inicial = pData Inicial;
    }
    /**
    * @return data inicial
    */
    public String  getData Inicial(){
        return this.data inicial;
    }

    /**
    * seta o valor de data final
    * @param pData Final
    */
    public void setData Final(String pData Final){
        this.data final = pData Final;
    }
    /**
    * @return data final
    */
    public String getData Final(){
        return this.data final;
    }

    /**
    * seta o valor de propriedades
    * @param pPropriedades
    */
    public void setPropriedades(String pPropriedades){
        this.propriedades = pPropriedades;
    }
    /**
    * @return propriedades
    */
    public String getPropriedades(){
        return this.propriedades;
    }

    /**
    * seta o valor de laboratório
    * @param pLaboratório
    */
    public void setLaboratório(String pLaboratório){
        this.laboratório = pLaboratório;
    }
    /**
    * @return laboratório
    */
    public String getLaboratório(){
        return this.laboratório;
    }

    /**
    * seta o valor de observações
    * @param pObservações
    */
    public void setObservações(String pObservações){
        this.observações = pObservações;
    }
    /**
    * @return observações
    */
    public String getObservações(){
        return this.observações;
    }

    @Override
    public String toString(){
        return "ModelTestFrontEnd {" + "::nome = " + this.nome + "::data inicial = " + this.data inicial + "::data final = " + this.data final + "::propriedades = " + this.propriedades + "::laboratório = " + this.laboratório + "::observações = " + this.observações +  "}";
    }
}