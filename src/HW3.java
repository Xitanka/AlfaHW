import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
        String[] petyaBasket = {"курица", "бананы", "творог"};
        String[] kolyaBasket = {"курица", "бананы", "творог"};
        String[] terentiiBasket = {"пиво", "бананы", "ласка магия черного"};

        //сравнение по составу
        boolean comparingOfBasketsPetyaKolya = Arrays.deepEquals(petyaBasket, kolyaBasket);
        boolean comparingOfBasketsPetyaTerentii = Arrays.deepEquals(petyaBasket, terentiiBasket);
        System.out.println("Сравнение корзин: " + comparingOfBasketsPetyaKolya);
        System.out.println("Сравнение корзин: " + comparingOfBasketsPetyaTerentii);

        //количество
        int basketPetyaLen = petyaBasket.length;
        System.out.println("У Пети в корзине товаров " + basketPetyaLen);
        int basketKolyaLen = petyaBasket.length;
        System.out.println("У Коли в корзине товаров " + basketKolyaLen);
        int basketTerentiiLen = petyaBasket.length;
        System.out.println("У Терентия в корзине товаров " + basketTerentiiLen);
        boolean comparingLength = basketPetyaLen == basketKolyaLen;
        boolean comparingLength2 = basketPetyaLen == basketTerentiiLen;
        System.out.println("Сравнение количества товаров корзин Пети и Коли - " + comparingLength);
        System.out.println("Сравнение количества товаров корзин Пети и Терентия - " + comparingLength2);

        //сравнение корзин
        boolean sameBasketPetyaKolya = Arrays.deepEquals(petyaBasket, kolyaBasket);
        System.out.println("Сравнение товаров корзин Пети и Коли - " + sameBasketPetyaKolya);
        boolean sameBasketPetyaTerentii = Arrays.deepEquals(petyaBasket, terentiiBasket);
        System.out.println("Сравнение товаров корзин Пети и Терентия - " + sameBasketPetyaTerentii);

        //Считаем длинное название
        int l1 = petyaBasket[0].length();
        int l2 = petyaBasket[1].length();
        int l3 = petyaBasket[2].length();
        int l4 = kolyaBasket[0].length();
        int l5 = kolyaBasket[1].length();
        int l6 = kolyaBasket[2].length();
        int l7 = terentiiBasket[0].length();
        int l8 = terentiiBasket[1].length();
        int l9 = terentiiBasket[2].length();

        int checkMaxSize = Math.max(l1, Math.max(l2, Math.max(l3, Math.max(l4, Math.max(l5, Math.max(l6, Math.max(l7, Math.max(l8, l9))))))));
        System.out.println(checkMaxSize);

        //создаем переменную строку в которую помещаем строку из массива если она является = максимальной
        String maxName = "";
        if (l1 == checkMaxSize) maxName = petyaBasket[0];
        if (l2 == checkMaxSize) maxName = petyaBasket[1];
        if (l3 == checkMaxSize) maxName = petyaBasket[2];
        if (l4 == checkMaxSize) maxName = kolyaBasket[0];
        if (l5 == checkMaxSize) maxName = kolyaBasket[1];
        if (l6 == checkMaxSize) maxName = kolyaBasket[2];
        if (l7 == checkMaxSize) maxName = terentiiBasket[0];
        if (l8 == checkMaxSize) maxName = terentiiBasket[1];
        if (l9 == checkMaxSize) maxName = terentiiBasket[2];

        //печатаем самое длинное наименование
        System.out.println(maxName);

        int checkMinSize = Math.min(l1, Math.min(l2, Math.min(l3, Math.min(l4, Math.min(l5, Math.min(l6, Math.min(l7, Math.min(l8, l9))))))));
        System.out.println(checkMinSize);
        double midNameCount = Math.round((double) (l1 + l2 + l3 + l4 + l5 + l6 + l7 + l8 + l9) / 9);
        System.out.println("Среднее количество букв в наименовании товара " + midNameCount);
    }
}
