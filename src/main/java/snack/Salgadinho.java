/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snack;

public class Salgadinho extends Prato {
    String recheio;
    String massa;
    String tipo;

    Salgadinho(String tipo, String recheio, String massa){
        setMassa(massa);
        setRecheio(recheio);
        setTipo(tipo);
    }

    public void setTipo(String tipo) { this.tipo=tipo;
    }
    @Override
    public void setRecheio(String recheio) {this.recheio=recheio;
    }
    public void setMassa(String massa) {this.massa=massa;
    }
    @Override
     public String getRecheio(){return recheio;}
    public String getTipo(){return tipo;}
    public String getMassa(){return massa;}
    public String toString(){
        return "Salgadinho: " + "       Massa: "+ massa +";" +" Recheio: " + recheio +";"+" Tipo: " + tipo +";";
    }

}