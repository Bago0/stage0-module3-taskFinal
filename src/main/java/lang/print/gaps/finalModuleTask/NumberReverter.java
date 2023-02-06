package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int last = number / 100;
        int second = number / 10 % 10;
        int first = number % 10;
        int reverted = first * 100 + second * 10 + last;
        System.out.println(reverted);
    }
}
