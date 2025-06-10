package minhas_receitas;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoJDBC{
    private Connection conn;
    PreparedStatement st;
    ResultSet rs;
    
    public void conectar() throws SQLException{
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/minhas_receitas","root", "Alexmosar@1");
          System.out.println("Conexao bem sucedida ");
        } catch (ClassNotFoundException ex) { 
            System.out.println(ex + "erro de conexao");
              }
    }
   public void desconectar(){
        try {
            if(conn !=null && !conn.isClosed()){
                conn.close();
                System.out.println("Conexao encerrada");
            }} catch (SQLException ex) {
                System.out.println("Erro ao desconectar");
            }
   } 
  public void salvarIngredientes(Ingredientes ingrediente){        
        try {                        
            st = this.conn.prepareStatement("INSERT INTO Ingredientes(nome, quantidade) VALUES (?,?)");
            st.setString(1,ingrediente.getNome());
            st.setInt(2, ingrediente.getQuantidade());
     
            st.executeUpdate();            
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());           
        }
    }
  public void salvarReceitas(Receitas receita){        
        try {                        
            st = this.conn.prepareStatement("INSERT INTO Receitas(nome receita, ingredientes, modo de preparo) VALUES (?,?,?)");
            st.setString(1,receita.getNomeReceita());
            st.setString(2, receita.getIngrediente());
            st.setString(3, receita.getModoPreparo());
     
            st.executeUpdate();            
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());           
        }
    }
}
