public class ErrorB {

    public static void main(String[] args) {
        int var1 = 15;
        int var2 = 5;
        int var3 = 0;
        int ans1 = var1 / var2;

        int ans2 = 0;

        try {
            ans2 = var1 / var3;
        } catch (ArithmeticException e) {
            System.out.println("Essa sua divisão vai gerar algum float meu caro... O outro é INT meu, pega leve.");
        }

        System.out.println("Division of va1 by var2 is: " + ans1);
        System.out.println("Division of va1 by var3 is: " + ans2);
    }
}
