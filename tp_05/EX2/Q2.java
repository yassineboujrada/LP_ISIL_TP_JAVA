package EX2;

class Q2 {
    public static void main(String[] args) {
        TestOrder.run(args);
    }
}

class TestOrder {
    public static void run(String[] args) {
        int N = 10;
        for (int i = 1; i <= N; i++) {
            Compteur compteur = new Compteur("Compteur " + i, 1000);
            Thread thread = new Thread(compteur);
            thread.start();
        }
    }
}
