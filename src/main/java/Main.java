import naruto.Naruto;
public class Main {
    public static void main(String[] args) {
        new Naruto();
        while (Naruto.hasNextAction()) {
            Naruto.act();
            Naruto.listen();
        }
    }
}
