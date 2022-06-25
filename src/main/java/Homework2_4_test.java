public class Homework2_4_test {
    public static void main(String[] args) {
        Homework2_4_test loop = new Homework2_4_test();
        loop.countSummary(1, 3);
    }

    public void countSummary(int num1, int num2) {
        int sum = 0;

        for (int a = num1; a <= num2; a++) {
            sum = sum + a;}
        System.out.println("The summary of 2 numbers : " + num1 + " and " + num2 + " is " + sum); }


}
