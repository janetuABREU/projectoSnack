
package snack;


import java.util.Scanner;

public abstract class Prato {
private double peso;
private String recheio;
private double preco;

 public double getPeso() {
  return peso;
 }

     public void setPeso(double peso) {
  this.peso = peso;
 }

 public String getRecheio() {
  return recheio;
 }

 public void setRecheio(String recheio) {
  this.recheio = recheio;
 }
 
 public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
 /**  void itenconsumido(Prato prato){

    }*/



}

    

