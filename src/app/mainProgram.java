package app;

public class mainProgram {

    public static void main(String[] arg) {

        int rows = 6;
        int sum = 0;
        int num = 1;

        for (int i = 1; i <= rows; i++){
            sum += num;
            System.out.printf("%d) Num is %d, sum is %d%n",i,num,sum);
            num++;
        }
        System.out.println("------------------------");
        System.out.print("Sum of numbers is " + sum);

    }

}
