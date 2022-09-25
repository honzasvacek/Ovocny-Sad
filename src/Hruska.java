public class Hruska {
    double hmotnost;
    double sisatost;

    public Hruska(double hmotnost, double sisatost) {
        this.hmotnost = hmotnost;
        this.sisatost = sisatost;
    }

    @Override
    public String toString() {
        return "Hruska{" +
                "hmotnost=" + hmotnost +
                ", sisatost=" + sisatost +
                '}';
    }
}
