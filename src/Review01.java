
public class Review01 {

    public static void main(String[] args) {
        int i = tax(1500,5);
        int price = 1500;
        int taxin = price+i;
        System.out.println(price+"円の商品の税込価格は"+taxin+"円（消費税は"+i+"円）です。");

    }
    public static int tax(int p, int taxp) {
        double tanp = (double)taxp/100;
        double result = p*tanp;
        int i = (int)result;

        return i;

    }

}
