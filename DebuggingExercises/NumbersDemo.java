
public class NumbersDemo {
    public static void main(String[] args) {
        int x = displayNumberPlusFive(10);
        System.out.println(x);
        int y = displayTwiceTheNumber(10);
        System.out.println(y);
        int z = displayNumberSquared(10);
        System.out.println(z);
    }
    static int displayNumberPlusFive(int x){
        return x + 5;
    }
    static int displayTwiceTheNumber(int y){
        return y * 2;
    }
    static int displayNumberSquared(int z){
        return z * z;
    }
}
