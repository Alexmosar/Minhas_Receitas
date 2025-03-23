
package minhas_receitas;

import Telas.TelaInicial;
import java.sql.SQLException;

public class Minhas_Receitas {

 
    public static void main(String[] args) throws SQLException {
        ConexaoJDBC conexao = new ConexaoJDBC();
        conexao.conectar();
    new TelaInicial().setVisible(true);
                
 
    }
    
}
