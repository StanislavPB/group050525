package lesson11.code.practice;

import lesson11.code.ifStatement.UserInputStatic;

public class ProductDemo {
    public static void main(String[] args) {
        // запросить у пользователя данные для создания нового продукта
        // создать новый продукт ТОЛЬКО если введенные данные удовлетворяют критериям:
        // - название не может быть пустым (ни одного символа или все - пробелы)
        // - цена не может быть отрицательной или 0

        String newProductName = UserInputStatic.inputText("Введите название продукта: ");
        int newProductPrice = UserInputStatic.inputInt("Введите цену продукта: ");


        if (newProductName.isBlank()) {
            System.out.println("Невозможно создать новый продукт с таким названием");
        } else if (newProductPrice <= 0) {
            System.out.println("Невозможно создать новый продукт с ценой меньше или равной нулю");
        } else {
            Product product = new Product(newProductName, newProductPrice);
            System.out.println(product);
        }
    }
}
