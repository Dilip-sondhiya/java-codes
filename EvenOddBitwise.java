public class EvenOddBitwise {
    public static void main(String[] args) {
        int num = 17;

        if ((num & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}