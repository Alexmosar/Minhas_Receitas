 
package minhas_receitas;

import java.util.Date;


public class Ingredientes {
    int id;
    String nome;
    int quantidade;
    String tipo;
    String dataCompra;
    String validadeIng;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getValidadeIng() {
        return validadeIng;
    }

    public void setValidadeIng(String validadeIng) {
        this.validadeIng = validadeIng;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

  
    @Override
    public String toString() {
        return this.getNome();
    }

    public Ingredientes(int id, String nome, int quantidade, String tipo, String dataCompra, String validadeIng) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.dataCompra = dataCompra;
        this.validadeIng = validadeIng;
    }

   

    public Ingredientes() {
    }

    public void getNome(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void getQuantidadeReceita(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void getTipo(String peso) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
}
