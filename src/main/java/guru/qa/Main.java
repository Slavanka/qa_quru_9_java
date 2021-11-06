package guru.qa;

public class Main {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Ди Каприо", "Лос-Анджелес");
        Actor actor2 = new Actor("Вася", "Москва");

        actor1.printNameToConsole();
        String actor1Name = actor1.getName();
        System.out.println(actor1Name);


    }
}
