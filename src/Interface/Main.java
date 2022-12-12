package Interface;


public class Main {
    public static void main (String[] args) {
        Bookkeeper b = new Bookkeeper();
        Director d = new Director();
        Worker w = new Worker();
        Method[] profession = new Method[]{b, d, w};

        for (Method pr: profession) {
            pr.printProfession();
        }
    }
}
