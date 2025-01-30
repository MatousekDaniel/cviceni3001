import Rostliny.Flower;
import Zvirata.Animal;

import java.util.ArrayList;
import java.util.Random;

public class Farm {

    private ArrayList<Flower> pozemek;
    private ArrayList<Animal> stodola;
    private int misto;
    private int voda;
    private double penize;

    Random rn = new Random();

    public Farm(ArrayList<Flower> pozemek, ArrayList<Animal> stodola, int misto, int voda, double penize) {
        this.pozemek = new ArrayList<>();
        this.stodola = stodola;
        this.misto = 100;
        this.voda = 1000;
        this.penize = 1000;
    }

    private void pridatRostlinu(Flower f){
        int n = rn.nextInt(11);
        if (misto - f.getNeededArea() > 0) {
            if(penize - f.getPrice() > 0) {
                f.zavlazeni();
                pozemek.add(f);
                misto = (int) (misto - f.getNeededArea());
                penize = (double) (penize - f.getPrice());
                if(f.isZavlazeno() == true){
                    voda = voda - 1;
                }
                if(n > 0 && n<= f.getChanceOfGrowth()){
                    f.setZrala(true);
                }
            }
        }
    }
    private void skliditRostlinu(Flower f){
        if(f.isZrala() == true){
            penize = (double) (f.getPrice() * 1.5);
            misto = (int) (misto + f.getNeededArea());
            pozemek.remove(f);
        } else if (f.isZrala() == false) {
            pozemek.remove(f);
        }
    }


}
