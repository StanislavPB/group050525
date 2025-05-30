package lesson07.code.privateAndPublic.usingPrivateModoficator;

public class UserDemo {
    public static void main(String[] args) {

        User user = new User("Ruslan", "ruslan@company.com","pass12345");

        user.printUserInfo();

        // предположим, что мы получили от пользователя новый email

        // Поскольку мы изменили модификатор доступа с default на private, то мы не модем обратится напрямую к полю
        // и изменить его значение
        // user.password = "ruslan@newcompany.com"; - запрещено

        /*
        в таком случае, для того, чтобы поменять значение в поле email нам необходимо создать метод внутри класса User
        задачей которого будет получение нового значения для поля email и сохранения этого значения в этом поле.

        Таким образом, теперь, чтобы поменять значение этого поля нам надо вызвать этот метод и передать в него навое значение.
         */

        user.changeEmail("ruslan@newcompany.com");

        user.printUserInfo();

        /*
        если нам необходимо проверить правильность пароля мы модем создать метод который бы возвращал нам значение,
        которое хранится в поле password

        Но это небезопасно (особенно если информация не подлежит публичному доступу)

        Вместо этого необходимо создать метод который будет принимать пароль для сравнения и вернет нам true или false
         */

    }
}
