import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
        String[] petyaBasket = {"курица", "бананы", "творог"};
        String[] kolyaBasket = {"курица", "бананы", "творог"};
        String[] terentiiBasket = {"курица", "бананы", "ласка магия черного"};

        //сравнение по составу
        boolean comparingOfBasketsPetyaKolya = Arrays.deepEquals(petyaBasket, kolyaBasket);
        boolean comparingOfBasketsPetyaTerentii = Arrays.deepEquals(petyaBasket, terentiiBasket);
        System.out.println(comparingOfBasketsPetyaKolya);
        System.out.println(comparingOfBasketsPetyaTerentii);

        //количество
        int basketPetyaLen = petyaBasket.length;
        System.out.println(basketPetyaLen);
    }
}
