public class HW1 {
    public static void main(String[] args) {
        String employeeName = "Глеб";
        String employee = "Старший шаурма-инженер";
        int salary = 1600;
        int quantityOfWorkingDays = 10;
        int thirteenSalary = 3000;
        int burningBreadFee = 500;
        int shaurmaPrice = 500;
        int shaurmaSalesQuantity = 67;

        System.out.println("Сотрудник: " + employeeName);
        System.out.println("Должность: " + employee);
        System.out.println("Зарплата: " + salary * quantityOfWorkingDays);
        System.out.println("Детализация оплаты: " + "Штраф: " + burningBreadFee +
                "Зарплата с премией: " + (salary * quantityOfWorkingDays + thirteenSalary));
        System.out.println("Выручка: " + shaurmaPrice * shaurmaSalesQuantity);
    }
}
