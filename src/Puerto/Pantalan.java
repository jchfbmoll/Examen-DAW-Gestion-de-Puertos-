package Puerto;

import java.util.ArrayList;
import java.util.List;
import Barco.*;

public class Pantalan {
    private int ID;
    private static int nextID = 0;

    private ArrayList<Amarre> listAmarre = new ArrayList<Amarre>();
    private String tipo;

    public Pantalan(){

    }
    public Pantalan(String tipo){
        ID = nextID;
        nextID++;
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }
    public ArrayList<Amarre> getListAmarre(){
        return listAmarre;
    }
    public void addAmarre(Amarre amarre){
        listAmarre.add(amarre);
    }
    @Override
    public String toString(){
        return "Pantalán[id="+ID+", tipo="+tipo;
    }
}
