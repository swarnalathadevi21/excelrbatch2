public class GreatestOfTwo {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 40;
        if (num1 > num2) {
            System.out.println(num1 + " is the greatest.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the greatest.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
