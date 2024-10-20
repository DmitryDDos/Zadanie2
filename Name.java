/*
public class Name { // 1 версия кода
    private String lastName;
    private String firstName;
    private String middleName;

    public Name(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (lastName != null && !lastName.isEmpty()) {
            sb.append(lastName);
        }
        if (firstName != null && !firstName.isEmpty()) {
            if (!sb.isEmpty()) sb.append(" ");
            sb.append(firstName);
        }
        if (middleName != null && !middleName.isEmpty()) {
            if (!sb.isEmpty()) sb.append(" ");
            sb.append(middleName);
        }
        return sb.toString();
    }
}
*/

public class Name { // 2 версия кода
    private String firstName; // Личное имя
    private String lastName; // Фамилия
    private String patronymic; // Отчество

    // Конструктор для создания имени с личным именем
    public Name(String firstName) {
        this.firstName = firstName;
    }

    // Конструктор для создания имени с личным именем и фамилией
    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Конструктор для создания полного имени
    public Name(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        StringBuilder fullName = new StringBuilder(firstName);
        if (lastName != null && !lastName.isEmpty()) {
            fullName.append(" ").append(lastName);
        }
        if (patronymic != null && !patronymic.isEmpty()) {
            fullName.append(" ").append(patronymic);
        }
        return fullName.toString();
    }
}