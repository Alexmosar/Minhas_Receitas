
package minhas_receitas;
import java.util.ArrayList;
  import java.util.List;
/**
 *
 * @author Usuário
 */
public class Listagem {
     private static final List<Ingredientes> lista = new ArrayList<>();

      // Métodos para acessarmos a lista e adicionarmos novos itens
      public static List<Ingredientes> Listar() {
          return lista;
      }
        public static void Adicionar(Ingredientes ingrediente) {
          lista.add(ingrediente);
      }
public class ListaReceita {
     private static final List<Receitas> rec = new ArrayList<>();

      // Métodos para acessarmos a lista e adicionarmos novos itens
      public static List<Receitas> ListarRec() {
          return rec;
      }
        public static void AdicionarRec(Receitas receita) {
          rec.add(receita);
      } 
}
}
