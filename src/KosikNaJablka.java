public class KosikNaJablka {
    int size;
    Jablko[] seznam;
    int pocetJablek = 0;

    public KosikNaJablka(int size) {
        this.size = size;
        seznam = new Jablko[size];
    }

    public void addJablko(Jablko j){
        try {
            seznam[pocetJablek] = j;
            pocetJablek++;
        }
        catch (Exception e){
            System.out.println("Jablko číslo " +  (pocetJablek + 1) + " se nevejde do košíku");
        }
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
