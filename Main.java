import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("Выберите действие от 0 до 4: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Ошибка! Введите целое число: ");
                scanner.next(); // Очистка ввода
            }
            int d = scanner.nextInt();
            if (d < 0 || d > 4) {
                System.out.println("Введено неверное значение!");
                continue;
            }
            switch (d) {
                case 0: // Остановка программы
                    System.out.println("Программа остановлена.");
                    return;

                case 1:
                    // Создание имен
                    /*Name name1 = new Name(null, "Клеопатра", null);
                    Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
                    Name name3 = new Name("Маяковский", "Владимир", null);

                    System.out.println(name1);
                    System.out.println(name2);
                    System.out.println(name3);
                    break;
                    */
                    Name cleopatra = new Name("Клеопатра");
                    Name pushkin = new Name("Александр", "Пушкин", "Сергеевич");
                    Name mayakovsky = new Name("Владимир", "Маяковский");
                    Name christopher = new Name("Христофор", "Бонифатьевич");

                    // Выводим имена
                    System.out.println(cleopatra); // Клеопатра
                    System.out.println(pushkin); // Александр Пушкин Сергеевич
                    System.out.println(mayakovsky); // Владимир Маяковский
                    System.out.println(christopher); // Христофор Бонифатьевич }
                    break;

                case 2:
                    // Создание домов
                    House house1 = new House(1);
                    House house2 = new House(5);
                    House house3 = new House(23);

                    System.out.println(house1.getDescription());
                    System.out.println(house2.getDescription());
                    System.out.println(house3.getDescription());
                    break;

                case 3:
                    Department itDepartment = new Department("IT", null); //Создаем отдел IT (сначала создаем отдел без начальника)
                    // Создаем сотрудников
                    Employee petrov = new Employee("Петров", itDepartment);
                    Employee kozlov = new Employee("Козлов", itDepartment);
                    Employee sidorov = new Employee("Сидоров", itDepartment);

                    // Назначаем Козлова начальником IT отдела
                    itDepartment.setHead(kozlov);

                    System.out.println(petrov); // Петров работает в отделе IT, начальник которого Козлов
                    System.out.println(kozlov); // Козлов начальник отдела IT
                    System.out.println(sidorov); // Сидоров работает в отделе IT, начальник которого Козлов

                    // Получаем список всех сотрудников отдела, имея ссылку на одного из них
                    List<Employee> colleagues = petrov.getColleagues();
                    System.out.println("Сотрудники отдела " + itDepartment.getName() + ":");
                    for (Employee colleague : colleagues) {
                        System.out.println(colleague.getName());
                    }

                case 4:
                    Fraction f1 = new Fraction(1, 3);
                    Fraction f2 = new Fraction(2, 3);
                    Fraction f3 = new Fraction(1, 4);
                    Fraction f4 = new Fraction(5, 1);

                    Fraction sumResult = f1.sum(f2); // 1/3 + 2/3 = 1/1
                    Fraction minusResult = f1.minus(f3); // 1/3 - 1/4 = 1/12
                    Fraction multiplyResult = f1.multiply(f2); // 1/3 * 2/3 = 2/9
                    Fraction divideResult = f1.divide(f2); // 1/3 / 2/3 = 1/2

                    // Вывод результатов
                    System.out.println(f1 + " + " + f2 + " = " + sumResult);
                    System.out.println(f1 + " - " + f3 + " = " + minusResult);
                    System.out.println(f1 + " * " + f2 + " = " + multiplyResult);
                    System.out.println(f1 + " / " + f2 + " = " + divideResult);

                    // Выполнение задачи
                    f1.sum(f2).divide(f3).minus1(5);
                    Fraction taskResult = f1.sum(f2).divide(f3).minus1(5);
                    System.out.println("Результат f1.sum(f2).div(f3).minus(5) = " + taskResult);
                    break;
            }
        }
    }
}