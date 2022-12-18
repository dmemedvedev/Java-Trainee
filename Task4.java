public class Task4 {
    public static void main(String[] args) {
        int n = 572;
        int x = n / 100;
        int y = n % 10;
        int z = n / 10;
        int zS = z % 10;
        int nS = x + y + zS;
        System.out.println("Result=" + nS);
    }
}
