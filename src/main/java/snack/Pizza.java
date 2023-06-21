
package snack;

public class Pizza extends Prato{
    private String molho;
   // private String recheio;
    private String cobertura;

    Pizza(String molho, String recheio, String cobertura){
        setMolho(molho);
        super.setRecheio(recheio);
        setCobertura(cobertura);
    }

    public void setCobertura(String cobertura) {
        this.cobertura=cobertura;
    }
//   public void setRecheio(String recheio) {
//        this.recheio=recheio;
//    }
    public void setMolho(String molho) {
        this.molho=molho;
    }
    public String getMolho(){
        return molho;
    }
//    public String getRecheio(){
//        return recheio;
//    }
    public String getCobertura(){
        return cobertura;
    }

    public String toString(){

        return "Pizza: " + "       Molho: "+ molho +";" +" Recheio: " + super.getRecheio() +";" +" Cobertura : " + cobertura +";";
    }



}
