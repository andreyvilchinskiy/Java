public class Employee {
    private String name;
    private String position;
    private Double salary;
    private static int employeeCount = 0;

    public Employee(String name, String position, Double salary) {
        this.name = name;
        this.position = position;
        if(salary<0){
            this.salary = 0.0;
        }else{
            this.salary = salary;
        }
        employeeCount++;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if(salary<0){
            this.salary = 0.0;
        }else{
            this.salary = salary;
        }
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public double calculateBonus() {
        return salary * 0.1;
    }
    @Override
    public String toString() {
        return name + " — " + position + ", оклад " + salary.intValue();
    }
}

