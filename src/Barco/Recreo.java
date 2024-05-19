package Barco;
import Puerto.Pantalan;
public class Recreo extends Barco{
    private String permiso;
    public Recreo(){

    }




    public Recreo(String matricula, String nombre, float tamano, String permiso){
        super(matricula, nombre, tamano);
        this.permiso = permiso;
    }
    @Override
    public boolean encajaTipo(Pantalan pantalan){
        if (pantalan.getTipo() == "Recreo"){
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return "Barco[matrícula="+getMatricula()+", nombre="+getNombre()+", tamanyo="+String.valueOf(getTamano()) +
                "Recreo[permiso="+permiso+"]]";
    }
}
