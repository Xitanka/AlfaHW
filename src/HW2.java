import java.util.Random;

public class HW2 {
    public static void main(String[] args) {
        //создаем объект класса Random
        Random random = new Random();

        //объявляем переменные с рандомайзером возраста и зарплаты посетителя
        // задаем верхнюю границу диапазона для возраста - 100, для накоплений - 100 000
        int visitorAge = random.nextInt(100);
        double visitorDeposit = random.nextDouble(100000.00);

        //объявляем переменные с заданными вручную значениями (есть ли приглашение или черный лист)
        boolean isVisitorInvited = false;
        boolean isVisitorInBlackList = false;

        //проверяем, подходит ли пользователь - каждое условие по отдельности.
        // Сохраняем результаты в булевые переменные
        boolean isAgeAvailableResult = visitorAge >= 18;
        boolean isVisitorInvitedOrDepositAcceptedResult = isVisitorInvited || visitorDeposit >= 50000;
        boolean isVisitorInBlackListResult = !isVisitorInBlackList;

        //проверяем, что каждое из условий было выполнено
        boolean canEnter = isAgeAvailableResult &&
                isVisitorInvitedOrDepositAcceptedResult && isVisitorInBlackListResult;

        //считаем комиссию
        double fee = visitorDeposit * 0.075;

        //напечатаем результат и посчитаем комиссию
        if (canEnter) {
            System.out.println("Доступ разрешен, комиссия составит: " + fee);
        } else System.out.println("Вы не можете прийти на мероприятие");

        // допишем вывод для условия участия (чтобы увидеть,
        // почему посетитель может или не может принять участие)
        System.out.println("Возраст: " + visitorAge);
        System.out.println("Сколько денег есть: " + visitorDeposit);
        System.out.println("Черный список: " + isVisitorInBlackListResult);
        System.out.println("Приглашение: " + isVisitorInvited);
    }
}
