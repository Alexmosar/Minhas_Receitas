 
package minhas_receitas;

import java.util.Date;


public class Ingredientes {
    String nomeIng;
    String quantidadeIng;
    String dataCompra;
    String validadeIng;

    public Ingredientes(){
        
    }
     public String getNomeIng() {
        return nomeIng;
    }

    public void setNomeIng(String nomeIng) {
        this.nomeIng = nomeIng;
    }

    public String getQuantidadeIng() {
        return quantidadeIng;
    }

    public void setQuantidadeIng(String quantidadeIng) {
        this.quantidadeIng = quantidadeIng;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getValidadeIng() {
        return validadeIng;
    }

    public void setValidadeIng(String validadeIng) {
        this.validadeIng = validadeIng;
    }

  

    public Ingredientes(String nomeIng, String quantidadeIng, String dataCompra, String validadeIng) {
        this.nomeIng = nomeIng;
        this.quantidadeIng = quantidadeIng;
        this.dataCompra = dataCompra;
        this.validadeIng = validadeIng;
       
    }

    
    
    
    
}
