package Barco;
import Puerto.Pantalan;

public class Comercial extends Barco{
    private String carga;
    public Comercial(){

    }
    public Comercial(String matricula, String nombre, float tamano, String carga ){
        super(matricula, nombre, tamano);
        this.carga = carga;
    }
    @Override
    public boolean encajaTipo(Pantalan pantalan){
        if (pantalan.getTipo() == "Comercial"){
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return "Barco[matrícula="+getMatricula()+", nombre="+getNombre()+", tamanyo="+getTamano()+
                "Comercial[carga="+carga+"]]";
    }
}
