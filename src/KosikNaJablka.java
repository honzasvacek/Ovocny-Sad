public class KosikNaJablka {
    int size;
    Jablko[] seznam;
    int pocetJablek = 0;

    public KosikNaJablka(int size) {
        this.size = size;
        seznam = new Jablko[size];
        //udělat vyjímku když pocetJablek > size JOOOOO KUUURVA
    }

    public void addJablko(Jablko j){
        seznam[pocetJablek] = j;
        pocetJablek++;
    }
    public void giveJablko(){

    }

    @Override
    public String toString() {
        String out = "";
        for(int i = 0; i < pocetJablek; i++){
            out += seznam[i];
            out += ", ";
        }
        return out;
    }
}
