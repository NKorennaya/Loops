public class Homework2_all_M3_Loops_NK { public static void main(String[] args) {
    Homework2_all_M3_Loops_NK loops_nk = new Homework2_all_M3_Loops_NK();
    loops_nk.printNumbers();
    Homework2_all_M3_Loops_NK loop = new Homework2_all_M3_Loops_NK();
    loop.countSummary(1, 3);
    Homework2_all_M3_Loops_NK nested_loop = new Homework2_all_M3_Loops_NK();
    nested_loop.Pyramid();
    Homework2_all_M3_Loops_NK double_loop = new Homework2_all_M3_Loops_NK();
    double_loop.downPyramid(7,1);
}

    //number 1
    public void printNumbers() {
        for (int i = 1; i <= 100; i++) {
            // System.out.println(i);

            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("The number " + i + " is divisible by two and three");
            } else if (i % 3 == 0) {
                System.out.println("The number " + i + " is divisible by three");
            } else if (i % 2 == 0) {
                System.out.println("The number " + i + " is even");
            } else {
                System.out.println("The number " + i + " is odd");
            }
        }
    }

    // number 2
    public void countSummary(int num1, int num2) {
        int sum = 0;

        for (int a = num1; a <= num2; a++) {
            sum = sum + a;
        }
        System.out.println("The summary of 2 numbers : " + num1 + " and " + num2 + " is " + sum);
    }

    //number 3
    public void Pyramid() {
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //bonus
    public void downPyramid (int up_num, int down_num) {
        for (int i = up_num; i >= 0; i--) {
            for (int j = down_num; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();

        }
    }
}
