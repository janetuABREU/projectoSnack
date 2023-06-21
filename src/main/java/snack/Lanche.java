/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snack;


import java.util.Scanner;

public class Lanche extends Prato{

    String pao;
    String recheio;
    String molho;

    Lanche( String pao, String recheio, String molho){
        setPao(pao);
        setRecheio(recheio);
        setMolho(molho);
    }

    public  void setMolho(String molho) { this.molho=molho;
    }
    public void setRecheio(String recheio) { this.recheio=recheio;
    }
    public void setPao(String pao) { this.pao=pao;
    }

    public String getMolho() {
        return molho;
    }
    public String getRecheio() {
        return recheio;
    }
    public String getPao() {
        return pao;
    }
    public String toString(){
        return "Lanche: " + "       Molho: "+ molho +";"+" Recheio: " + recheio +";"+ " PÃ£o: " +pao +";";
    }


}
