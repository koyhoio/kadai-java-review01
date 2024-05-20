
public class Clock {

    public static void main(String[] args) {
        int h =15;
        int m=30;
        int s =50;
        int result =getSeconds(h,m,s);
        System.out.println(result);

    }
    public static int getSeconds(int h,int m,int s) {
        int result = h*3600+m*60+s;
        return result;
    }

}
