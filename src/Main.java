import Puerto.Puerto;
import Puerto.Pantalan;
import Barco.Barco;
import Barco.Comercial;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pantalan> listPantalan = new ArrayList<Pantalan>();
        ArrayList<Barco> barcosEntrantes = new ArrayList<Barco>();
        Puerto puerto = new Puerto(listPantalan);

        Barco comercial = new Comercial("4567", "Tsunami", 110.0f, "Carga Textil" );
        comercial.cargarBarcosEntrantes(barcosEntrantes);
        barcosEntrantes.add(comercial);

        Puerto.simular(listPantalan);
        Puerto.buscarAmarre(barcosEntrantes, listPantalan);
        Puerto.verAmarre(listPantalan);

    }
}