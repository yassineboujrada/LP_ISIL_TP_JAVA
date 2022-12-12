// Refaire la même chose en héritant de la class Thread

public class Q2 extends Thread {
    public static void main(String[] args) {
        Q2 q2 = new Q2();
        q2.start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}
