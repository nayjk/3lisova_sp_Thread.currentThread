public class Main implements Runnable{
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++){
            (new Thread(new Main())).start();
        }
    }

    public void run() {
        System.out.println(Thread.currentThread());
    }
}