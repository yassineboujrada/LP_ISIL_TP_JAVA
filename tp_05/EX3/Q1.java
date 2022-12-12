package EX3;

class Valeur {
    private int valeur;

    public Valeur(int valeur) {
        this.valeur = valeur;
    }

    public int getVal() {
        return valeur;
    }

    public synchronized void add(int i) {
        valeur += i;
    }

    @Override
    public String toString() {
        return "Valeur{" +
                "valeur=" + valeur +
                '}';
    }
}


class Ajob implements Runnable {
    private Valeur myVal;
    private int i;

    public Ajob(Valeur myVal, int i) {
        this.myVal = myVal;
        this.i = i;
    }

    @Override
    public void run() {
        for (int j = 0; j < 1000000; j++) {
            myVal.add(i);
        }
    }
}


class Run {
    public static void main(String[] args) {
        Valeur myVal = new Valeur(0);
        Ajob job1 = new Ajob(myVal, 1);
        Ajob job2 = new Ajob(myVal, -1);
        Thread t1 = new Thread(job1);
        Thread t2 = new Thread(job2);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(myVal);
    }
}