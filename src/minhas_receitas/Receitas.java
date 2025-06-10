
package minhas_receitas;


public class Receitas   {
    int id;
    String nomeReceita;
    String modoPreparo;
    String tipo;
    String ingrediente;
    String quantidadeReceita;
    String selecao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeReceita() {
        return nomeReceita;
    }

    public void setNomeReceita(String nomeReceita) {
        this.nomeReceita = nomeReceita;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getQuantidadeReceita() {
        return quantidadeReceita;
    }

    public void setQuantidadeReceita(String quantidadeReceita) {
        this.quantidadeReceita = quantidadeReceita;
    }

    public String getSelecao() {
        return selecao;
    }

    public void setSelecao(String selecao) {
        this.selecao = selecao;
    }

    public Receitas(int id, String nomeReceita, String modoPreparo, String tipo, String ingrediente, String quantidadeReceita, String selecao) {
        this.id = id;
        this.nomeReceita = nomeReceita;
        this.modoPreparo = modoPreparo;
        this.tipo = tipo;
        this.ingrediente = ingrediente;
        this.quantidadeReceita = quantidadeReceita;
        this.selecao = selecao;
    }

    public Receitas() {
    }

  
    
    
}
