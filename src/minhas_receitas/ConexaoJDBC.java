package minhas_receitas;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConexaoJDBC{
    private Connection conn;
    
    public void conectar() throws SQLException{
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/minhas_receitas","root", "Alexmosar@1");
          System.out.println("Conexao bem sucedida ");
        } catch (ClassNotFoundException ex) { 
            System.out.println(ex + "erro de conexao");
              }
    }
}
