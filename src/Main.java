// Huvudprogrammet
public class Main
{
    // Main-metoden
    public static void main(String[] args)
    {
        int mynumber = 23;
        System.out.println("Hello World");
        System.out.println(mynumber);

        // Skapar en ny klass
        TeamClass classOne = new TeamClass("Class One", 10);
        System.out.println(classOne.getName());
        System.out.println(classOne.getPoints());

        // Skapar en ny klass two
        TeamClass classTwo = new TeamClass("Class Two", 20);
    }
}
