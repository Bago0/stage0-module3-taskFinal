package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int last = number / 1000;
        int third = number / 100 % 10;
        int second = number / 10 % 10;
        int first = number % 10;
        int sum = first + second + third + last;
        System.out.println(sum);
    }
}
