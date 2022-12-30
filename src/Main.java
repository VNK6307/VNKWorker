public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = (v) -> System.out.println(v);
        OnTaskErrorListener error = (v) -> System.out.println(v);
        Worker worker = new Worker(listener, error);
        worker.start();
    }
}