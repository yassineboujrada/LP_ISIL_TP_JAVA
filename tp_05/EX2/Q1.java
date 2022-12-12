package EX2;




class Q1 {
    public static void main(String[] args) {
        int N = 10;
        for (int i = 1; i <= N; i++) {
            Compteur compteur = new Compteur("Compteur " + i, 1000);
            Thread thread = new Thread(compteur);
            thread.start();
        }
    }
}
// Écrire une classe Compteur(String nom, int maxValue) qui compte de 1 à MaxValue 
// avec un delay de 100ms. A chaque itération, elle affiche son nom et la valeur du 
// compteur.


class Compteur implements Runnable {
    private String nom;
    private int maxValue;

    public Compteur(String nom, int maxValue) {
        this.nom = nom;
        this.maxValue = maxValue;
    }

    @Override
    public void run() {
        for (int i = 1; i <= maxValue; i++) {
            System.out.println(nom + " : " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}