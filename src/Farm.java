import Rostliny.Flower;
import Zvirata.Animal;

import java.util.ArrayList;

public class Farm {

    private ArrayList<Flower> pozemek;
    private ArrayList<Animal> stodola;
    private int misto;
    private int voda;
    private int penize;

    public Farm(ArrayList<Flower> pozemek, ArrayList<Animal> stodola, int misto, int voda, int penize) {
        this.pozemek = new ArrayList<>();
        this.stodola = stodola;
        this.misto = 100;
        this.voda = 1000;
        this.penize = 1000;
    }

    private void pridatRostlinu(Flower f){
        if (misto - f.getNeededArea() > 0) {
            if(penize - f.getPrice() > 0) {
                pozemek.add(f);
                misto = (int) (misto - f.getNeededArea());
                penize = (int) (penize - f.getPrice());
                if(f.isZavlazeno() == true){
                    voda = voda - 1;
                }
            }
        }
    }


}
