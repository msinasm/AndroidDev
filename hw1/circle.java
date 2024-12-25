public class Circle {
    static double p = 3.14;

    public static double calcSide(int r) {
        //masahat
        return r * r * p;
    }

    public static double calcCirc(int r) {
        //Mohit
        return 2 * p * r;
    }

    public static void main(String[] args) {
        System.out.println(calcCirc(4)); // 25.12
        System.out.println(calcSide(4)); // 50.24
    }
}
