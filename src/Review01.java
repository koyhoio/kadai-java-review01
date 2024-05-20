
public class Review01 {

    public static void main(String[] args) {
        int result = tax(1500,10);
        int p = 1500;
        int taxin = p+result;
        System.out.println(p+"円の商品の税込価格は"+taxin+"円（消費税は"+result+"円）です。");

    }
    public static int tax(int price, int taxp) {
        int result = price/taxp;

        return result;

    }

}
