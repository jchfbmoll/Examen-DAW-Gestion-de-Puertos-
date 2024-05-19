package Puerto;

import java.util.ArrayList;
import Barco.*;
public class Puerto {
    private ArrayList<Barco> barcosEntrantes;
    private ArrayList<Pantalan> listPantalan;
    public Puerto(){

    }
    public Puerto(ArrayList<Pantalan> listPantalan){
        this.listPantalan = listPantalan;
    }

    public static void buscarAmarre(ArrayList<Barco> barcosEntrantes, ArrayList<Pantalan> listPantalan){

        for(int i = 0; i<barcosEntrantes.size(); i++){
            Barco barco = barcosEntrantes.get(i);
            boolean barcometido = false;
            for (Pantalan pantalan: listPantalan){
                if (barco.encajaTipo(pantalan ) && !barcometido){
                    for(Amarre amarre: pantalan.getListAmarre()){
                        if (!amarre.getOcupado() && barco.encajaTamano(amarre)>=0.0f){
                            amarre.setOcupado(true);
                            amarre.setBarco(barco);
                            barcosEntrantes.remove(i);
                            i--;
                            barcometido = true;
                            break;
                        }
                    }
                }
                if (barcometido){
                    break;
                }
            }

        }

    }
    public static void verAmarre(ArrayList<Pantalan> listPantalan){
        for(Pantalan pantalan: listPantalan){
            String strPantalan = pantalan.toString();
            System.out.println(strPantalan);
            for(Amarre amarre: pantalan.getListAmarre()){
                String strAmarre = amarre.toString();
                System.out.println("\n[\n"+strAmarre+"\n]");
            }
            System.out.println("]");
        }
    }
    public static void simular(ArrayList<Pantalan> listPantalan){
        Amarre amarre1 = new Amarre(100);
        Amarre amarre2 = new Amarre(100);
        Amarre amarre3 = new Amarre(60);
        Amarre amarre4 = new Amarre(120);
        Amarre amarre5 = new Amarre(10);
        Amarre amarre6 = new Amarre(10);

        Pantalan pantalan1 = new Pantalan("Comercial");
        Pantalan pantalan2 = new Pantalan("Comercial");
        Pantalan pantalan3 = new Pantalan("Recreo");

        pantalan1.addAmarre(amarre1);
        pantalan1.addAmarre(amarre2);
        pantalan2.addAmarre(amarre3);
        pantalan2.addAmarre(amarre4);
        pantalan3.addAmarre(amarre5);
        pantalan3.addAmarre(amarre6);

        listPantalan.add(pantalan1);
        listPantalan.add(pantalan2);
        listPantalan.add(pantalan3);


    }
}
