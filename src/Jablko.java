public class Jablko {
        double hmotnost;
        String color;

        public Jablko(double hmotnost, String color) {
                this.hmotnost = hmotnost;
                this.color = color;
        }

        @Override
        public String toString() {
                return "Jablko{" +
                        "hmotnost=" + hmotnost +
                        ", color='" + color + '\'' +
                        '}';
        }
}
