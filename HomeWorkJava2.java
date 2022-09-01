public class HomeWorkJava2 {

    // 1 задание
    public static void main(String[] args) {
    }
    public static boolean one(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20){
            return true;
        } else {
            return false;
        }
    }

    // 2 задание
    public static void two(int x){
        if (x >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // 3 задание
    public static boolean three(int a){
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    // 4 задание
    public static void four(String str, int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(i + str);
        }
    }


}