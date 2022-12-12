// A l’aide de l’interface Runnable Écrire un programme qui crée deux Threads TA et TB, 
// l’un devra compter de 1 à 1000 et l’autre décompter de 1000 à 1.

public class Q1 implements Runnable {
    public static void main(String[] args) {
        Q1 q1 = new Q1();
        Thread t1 = new Thread(q1);
        Thread t2 = new Thread(q1);
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("Thread-0")) {
            for (int i = 1; i <= 1000; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = 1000; i >= 1; i--) {
                System.out.println(i);
            }
        }
    }
}