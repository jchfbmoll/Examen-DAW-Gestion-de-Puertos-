package Puerto;
import Barco.*;
public class Amarre {
    private int id;
    private static int nextID = 0;

    private float tamano;
    private boolean ocupado = false;
    private Barco barco;

    public Amarre(){

    }
    public Amarre(float tamano){
        this.id = nextID;
        nextID ++;
        this.tamano = tamano;
    }
    public float getTamano(){
        return tamano;
    }
    public boolean getOcupado(){
        return ocupado;
    }
    public void setOcupado(boolean ocupado){
        this.ocupado = ocupado;
    }
    public void setBarco(Barco barco){
        this.barco = barco;
    }
    public Barco getBarco(){
        return barco;
    }
    @Override
    public String toString(){
        String strAmarre = "Amarre[id="+id+", tamanyo="+tamano+", ocupado="+ocupado;
        if (ocupado){
            strAmarre+=",barco = "+barco.toString();
        }

        strAmarre+="]";

        return strAmarre;
    }


}
