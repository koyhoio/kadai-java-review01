
public class Review01 {

    public static void main(String[] args) {
        int result = tax(1500,10);
        int price = 1500;
        int taxin = price+result;
        System.out.println(price+"円の商品の税込価格は"+taxin+"円（消費税は"+result+"円）です。");

    }
    public static int tax(int p, int taxp) {
        int result = p/taxp;

        return result;

    }

}
