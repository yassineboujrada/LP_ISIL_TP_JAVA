package EX4;


class voiture extends Thread {
    private int id;
    private Parking parking;

    public voiture(int id, Parking parking) {
        this.id = id;
        this.parking = parking;
    }

    @Override
    public void run() {
        while (!parking.enter()) {
            System.out.println("Voiture " + id + " attend");
        }
        System.out.println("Voiture " + id + " entre");
        try {
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        parking.quitter();
        System.out.println("Voiture " + id + " sort");
    }
}

class Parking {
    private int N;
    private int nbVoitures;

    public Parking(int N) {
        this.N = N;
        this.nbVoitures = 0;
    }

    public synchronized boolean enter() {
        if (nbVoitures < N) {
            nbVoitures++;
            return true;
        }
        return false;
    }

    public synchronized void quitter() {
        nbVoitures--;
    }
}

public class app {
    public static void main(String[] args) {
        int N = 10;
        Parking parking = new Parking(N);
        for (int i = 1; i <= N; i++) {
            voiture voiture = new voiture(i, parking);
            voiture.start();
        }
    }
}



