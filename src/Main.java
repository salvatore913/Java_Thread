public class Main {
    public static void main(String[] args) {
        ThreadGroup mainGroup = new ThreadGroup("main group");
        System.out.println("Создаю потоки...");
        new MyThread(mainGroup, "Поток 1").start();
        new MyThread(mainGroup, "Поток 2").start();
        new MyThread(mainGroup, "Поток 3").start();
        new MyThread(mainGroup, "Поток 4").start();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Завершаю все потоки...");
        mainGroup.interrupt();
    }
}
