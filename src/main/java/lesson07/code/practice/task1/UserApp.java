package lesson07.code.practice.task1;

import lesson07.code.scanner.UserInput;

public class UserApp {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        System.out.println("Ввод данных для регистрации нового пользователя: ");

        String name = userInput.inputText("Введите имя пользователя: ");
        String email = userInput.inputText("Введите email пользователя: ");
        String address = userInput.inputText("Введите адрес пользователя: ");
        String password = userInput.inputText("Введите пароль пользователя: ");
        String department = userInput.inputText("Введите отдел пользователя: ");

        User user = new User(name,email,address,password,department);

        System.out.println(user);

    }
}
