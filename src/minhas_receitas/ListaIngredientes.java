
package minhas_receitas;
import java.util.ArrayList;
  import java.util.List;
import javax.swing.JOptionPane;

public class ListaIngredientes extends Ingredientes {
     private static final ArrayList<Ingredientes> lista = new ArrayList<>();
     public static void adicionarIngrediente(Ingredientes i){
         try{
             if(i.getNome().isBlank() || i.getNome().isEmpty()){
                 JOptionPane.showMessageDialog(null, "Preencha o nome corretamente", "Erro", JOptionPane.ERROR_MESSAGE);
             }
             else if(i.getQuantidade()<=0){
                 JOptionPane.showMessageDialog(null, "Preencha a quantidade corretamente", "Erro", JOptionPane.ERROR_MESSAGE);
             }else{
                     lista.add(i);
                     }             
         }catch(Exception ex){
             System.out.println("Erro ao adicionar");
         }
     }

     public static ArrayList<Ingredientes> listar(){
        return lista;
    }
   /* private static final ArrayList<Receitas> listarec = new ArrayList<>();
    
     public static void adicionarIngredienteReceita(Ingredientes ir){
         try{
             if(ir.getNome().isBlank() || ir.getNome().isEmpty()){
                 JOptionPane.showMessageDialog(null, "Preencha o nome corretamente", "Erro", JOptionPane.ERROR_MESSAGE);
             }
             else if(ir.getQuantidadeReceita()){
                 JOptionPane.showMessageDialog(null, "Preencha a quantidade corretamente", "Erro", JOptionPane.ERROR_MESSAGE);
             }else{
                     listarec.add(ir);
                     }             
         }catch(Exception ex){
             System.out.println("Erro ao adicionar");
         }
     } public static ArrayList<Receitas> listarrec(){
        return listarec;
    }*/
}
