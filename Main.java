import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("Выберите действие от 0 до 3: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Ошибка! Введите целое число: ");
                scanner.next(); // Очистка ввода
            }
            int d = scanner.nextInt();
            if (d < 0 || d > 20) {
                System.out.println("Введено неверное значение!");
                continue;
            }
            switch (d) {
                case 0: // Остановка программы
                    System.out.println("Программа остановлена.");
                    return;
                case 1:
                    // Создание имен
                    Name name1 = new Name(null, "Клеопатра", null);
                    Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
                    Name name3 = new Name("Маяковский", "Владимир", null);

                    System.out.println(name1);
                    System.out.println(name2);
                    System.out.println(name3);
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
                    Department itDepartment = new Department("IT", null); // Сначала создаем отдел без начальника

                    // Создаем сотрудников
                    Employee petrov = new Employee("Петров", itDepartment);
                    Employee kozlov = new Employee("Козлов", itDepartment);
                    Employee sidorov = new Employee("Сидоров", itDepartment);

                    // Назначаем Козлова начальником IT отдела
                    itDepartment.setHead(kozlov);

                    // Выводим текстовое представление всех сотрудников
                    System.out.println(petrov); // Петров работает в отделе IT, начальник которого Козлов
                    System.out.println(kozlov); // Козлов начальник отдела IT
                    System.out.println(sidorov); // Сидоров работает в отделе IT, начальник которого Козлов
                    break;
            }
        }
    }
}