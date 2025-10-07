public class TeamClass
{
    // public enum TeamColor {RED("red", 1), BLUE("blue", 3), YELLOW("yellow", 4")};
    private final String name;
    private int points;

    public TeamClass(String name, int points)
    {
        this.name = name;
        this.points = points;
    }

    public String getName()
    {
        return name;
    }

    public int getPoints()
    {
        return points;
    }

    public void setPoints(int points)
    {
        this.points = points;
    }
}
