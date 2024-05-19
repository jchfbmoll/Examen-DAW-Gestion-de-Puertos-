package Barco;

import java.util.ArrayList;
import Puerto.*;

public abstract class Barco {
    private String matricula;
    private String nombre;
    private float tamano;

    public Barco(){

    }
    public Barco(String matricula, String nombre, float tamano){
        this.matricula = matricula;
        this.nombre = nombre;
        this.tamano = tamano;
    }
    public static String mayorTamano(ArrayList<Barco> barcosEntrantes){
        String matriculaMayor = "";
        float mayor = 0;
        for (Barco barco: barcosEntrantes){
            if (barco.tamano > mayor){
                mayor = barco.tamano;
                matriculaMayor = barco.matricula;
            }
        }
        return matriculaMayor;
    }
    public abstract boolean encajaTipo(Pantalan pantalan);

    public float encajaTamano(Amarre amarre){
        return amarre.getTamano() - this.tamano;

    }

    public static void cargarBarcosEntrantes(ArrayList<Barco> barcosEntrantes){
        Barco comercial = new Comercial("1234", "Poseidón", 80.0f, "Carga Textil");
        Barco recreo = new Recreo("2345", "Tritón", 6.0f, "Permiso recreativo");
        barcosEntrantes.add(comercial);
        barcosEntrantes.add(recreo);
    }
    public String getMatricula(){
        return matricula;
    }
    public String getNombre(){
        return nombre;
    }
    public float getTamano(){
        return tamano;
    }
    @Override
    public abstract String toString();
}
