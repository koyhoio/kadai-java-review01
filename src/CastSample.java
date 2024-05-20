
public class CastSample {

    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        System.out.println(a/b);

        System.out.println((double)a/b);
        // 下の記載はNG、割り算（計算式）にキャストするのではなく、変数（A二対してキャストする
        System.out.println((double)(a/b));

    }

}
