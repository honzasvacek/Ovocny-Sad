public class OvocnySad {
    public static void main(String[] args) {
        Jablko jablko1 = new Jablko(55, "Red");
        Jablko jablko2 = new Jablko(58, "Green");

        Hruska hruska1 = new Hruska(68, 2);
        Hruska hruska2 = new Hruska(70, 1.6); //test github commit

        KosikNaJablka J = new KosikNaJablka(5);
        J.addJablko(jablko1);
        //System.out.println(jablko1.toString());
        J.addJablko(jablko2);
        //System.out.println(jablko2); //nemusím psát: .toString, když ta metoda je ve třídě
        System.out.println(J);

    }
}
