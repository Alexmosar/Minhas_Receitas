
package minhas_receitas;


public class ItensReceita {
    String Ingrediente;
    Double QtdadeItemReceita;

    public String getIngrediente() {
        return Ingrediente;
    }

    public void setIngrediente(String Ingrediente) {
        this.Ingrediente = Ingrediente;
    }

    public Double getQtdadeItemReceita() {
        return QtdadeItemReceita;
    }

    public void setQtdadeItemReceita(Double QtdadeItemReceita) {
        this.QtdadeItemReceita = QtdadeItemReceita;
    }

    public ItensReceita(String Ingrediente, Double QtdadeItemReceita) {
        this.Ingrediente = Ingrediente;
        this.QtdadeItemReceita = QtdadeItemReceita;
    }
    
    
}
