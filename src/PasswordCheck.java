public class PasswordCheck {
    public static void main(String[] args) {
        //создаем массив с паролями, которые нужно проверить
        String[] passwords = {
                "VeryBerry2022!",
                "1StrongPass",
                "StrongPassz",
                "MyQwertyPass",
                "MyBadPass1234"
        };

        //каждый пароль будет проверен по индексу и результат пишем в отдельную переменную
        boolean check1 = passwords[0].toLowerCase().length() > 8
                && !passwords[0].startsWith("1")
                && !passwords[0].toLowerCase().endsWith("z")
                && !passwords[0].toLowerCase().contains("qwerty")
                && !passwords[0].toLowerCase().contains("1234");
        System.out.println("Пароль " + passwords[0] + " - " + check1 );

        boolean check2 = passwords[1].toLowerCase().length() > 8
                && !passwords[1].startsWith("1")
                && !passwords[1].toLowerCase().endsWith("z")
                && !passwords[1].toLowerCase().contains("qwerty")
                && !passwords[1].toLowerCase().contains("1234");
        System.out.println("Пароль " + passwords[1] + " - " + check2 );

        boolean check3 = passwords[2].length() > 8
                && !passwords[2].startsWith("1")
                && !passwords[2].toLowerCase().endsWith("z")
                && !passwords[2].toLowerCase().contains("qwerty")
                && !passwords[2].toLowerCase().contains("1234");
        System.out.println("Пароль " + passwords[2] + " - " + check3 );

        boolean check4 = passwords[3].length() > 8
                && !passwords[3].startsWith("1")
                && !passwords[3].toLowerCase().endsWith("z")
                && !passwords[3].toLowerCase().contains("qwerty")
                && !passwords[3].toLowerCase().contains("1234");
        System.out.println("Пароль " + passwords[3] + " - " + check4 );

        boolean check5 = passwords[4].toLowerCase().length() > 8
                && !passwords[4].startsWith("1")
                && !passwords[4].toLowerCase().endsWith("z")
                && !passwords[4].toLowerCase().contains("qwerty")
                && !passwords[4].toLowerCase().contains("1234");
        System.out.println("Пароль " + passwords[4] + " - " + check5 );

    }
}
