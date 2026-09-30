
public class Main {

    public static double totalBonusBudget(Employee[] staff) {
        double total = 0;
        for (Employee emp : staff) {
            total += emp.calculateBonus();
        }
        return total;
    }

    public static void main(String[] args) {

        Employee[] staff = new Employee[4];
        staff[0] = new Employee("Иванов И.И.", "Разработчик", 90000.0);
        staff[1] = new Employee("Петров П.П.", "Тестировщик", 70000.0);
        staff[2] = new Manager("Сидоров С.С.", "Руководитель отдела", 120000, 5);
        staff[3] = new Manager("Кузнецова А.А.", "Руководитель проекта", 150000, 3);

        System.out.println("Сотрудники и их премии");
        for (Employee item : staff) {
            System.out.println(item);
            System.out.println("  Премия: " + item.calculateBonus() + " руб.");
        }

        System.out.println("\nМенеджеры");
        int managerCount = 0;
        for (Employee item : staff) {
            if (item instanceof Manager) {
                Manager m = (Manager) item;
                System.out.println(m.getName() + " — менеджер, команда " + m.getTeamSize() + " чел.");
                managerCount++;
            }
        }
        System.out.println("Всего менеджеров: " + managerCount);
        System.out.println("\nОбщий бюджет на премии");
        double total = totalBonusBudget(staff);
        System.out.println("Суммарная премия: " + total + " руб.");
        System.out.println("Количество сотрудников = " + Employee.getEmployeeCount());
    }
}
/*
 * В части Г проверки типов не нужны, потому что Java сама выбирает нужный
 * метод calculateBonus() по реальному типу объекта (Employee или Manager)
 * во время выполнения. Это и есть полиморфизм: один и тот же вызов даёт
 * разный результат в зависимости от того, кто именно лежит в переменной.
 */