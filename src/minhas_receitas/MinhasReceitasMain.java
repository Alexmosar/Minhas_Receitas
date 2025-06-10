
package minhas_receitas;

import Telas.TelaInicial;
import java.sql.SQLException;

public class MinhasReceitasMain {

 
    public static void main(String[] args) throws SQLException {
        ConexaoJDBC conexao = new ConexaoJDBC();
        conexao.conectar();
        conexao.desconectar();
    new TelaInicial().setVisible(true);
                
 
    }
    
}
