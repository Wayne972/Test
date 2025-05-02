public class Problem4 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 2; i <= 1000; i += 2) { 
            sum += i;

            if (sum > 500) {
                System.out.println("The sum exceeded 500. Current sum: " + sum);
                break;
            }
        }
    }
}