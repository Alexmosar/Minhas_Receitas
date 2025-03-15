
package minhas_receitas;


public class Receitas {
    String nomeRec;
    String modoPre;
    //double QtdReceita;

    public Receitas() {
         }

    public String getNomeRec() {
        return nomeRec;
    }

    public void setNomeRec(String nomeRec) {
        this.nomeRec = nomeRec;
    }

    public String getModoPre() {
        return modoPre;
    }

    public void setModoPre(String modoPre) {
        this.modoPre = modoPre;
    }

   /* public double getQtdReceita() {
        return QtdReceita;
    }

    public void setQtdReceita(double QtdReceita) {
        this.QtdReceita = QtdReceita;
    }*/

    public Receitas(String nomeRec, String modoPre /*double QtdReceita*/) {
        this.nomeRec = nomeRec;
        this.modoPre = modoPre;
       // this.QtdReceita = QtdReceita;
    }

    
    
    
    
}
