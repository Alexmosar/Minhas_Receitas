
package minhas_receitas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ListaReceitas {
    
     private static final ArrayList<Receitas> listaReceita = new ArrayList<>();
     public static void adicionarReceita(Receitas r){
        try{
         if(r.nomeReceita.isBlank()|| r.nomeReceita.isEmpty() ){
             JOptionPane.showMessageDialog(null, "Preencha o nome corretamente", "Erro", JOptionPane.ERROR_MESSAGE);
         }else if(r.modoPreparo.isBlank()|| r.modoPreparo.isEmpty()){
             JOptionPane.showMessageDialog(null, "Preencha o modo de preparo", "Erro", JOptionPane.ERROR_MESSAGE);
         }else if(r.ingrediente.isBlank()||r.ingrediente.isEmpty()){
             JOptionPane.showMessageDialog(null, "Preencha o nome corretamente", "Erro", JOptionPane.ERROR_MESSAGE);
         }else{
             listaReceita.add(r);
         }
     }catch(Exception ex) {
         System.out.println("Erro ao adicionar");
         
     }
     }
       public static ArrayList<Receitas> listar(){
        return listaReceita;
    }

 
     
}

