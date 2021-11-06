package guru.qa;

public class Actor {
    private final String name;
    private final String city;

    public Actor (String name, String city) {
        this.name = name;
        this.city = city;
    }

   public void printNameToConsole() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }
}
