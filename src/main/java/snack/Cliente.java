/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snack;
  public  class Cliente {
       private String nome;
       private int codigo;
       Cliente(String nome, int codigo){
            setCodigo(codigo);
            setNome(nome);
        }
    public String getNome(){
           return nome;
    }
    public int getCodigo(){
           return codigo;
    }
    public void setNome(String nome){
           this.nome= nome;
    }
    public void setCodigo(int codigo){
           this.codigo= codigo;
    }
}
