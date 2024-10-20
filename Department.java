import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name; // Название отдела
    private List<Employee> employees; // Список сотрудников
    private Employee head; // Начальник отдела

    public Department(String name, Employee head) {
        this.name = name;
        this.head = head;
        this.employees = new ArrayList<>();
        addEmployee(head); // Добавляем начальника в список сотрудников
         }

        public String getName() {
            return name; // Получение названия отдела
        }

        public void addEmployee(Employee employee) {
            employees.add(employee); // Добавление сотрудника в отдел
        }

        public List<Employee> getEmployees() {
            return employees; // Возвращение списка сотрудников
        }

        public Employee getHead() {
            return head; // Получение начальника отдела
        }

        public void setHead(Employee head) {
            this.head = head; // Установка нового начальника отдела
        }
    }
