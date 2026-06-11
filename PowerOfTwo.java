public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 16;

        if (num > 0 && (num & (num - 1)) == 0)
            System.out.println("Power of Two");
        else
            System.out.println("Not a Power of Two");
    }
}