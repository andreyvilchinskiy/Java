public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, String position, double salary, int teamSize) {
        super(name, position, salary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.15 + teamSize * 1000;
    }

    @Override
    public String toString() {
        return super.toString() + ", команда " + teamSize + " чел.";
    }

    public int getTeamSize() {
        return teamSize;
    }
}
