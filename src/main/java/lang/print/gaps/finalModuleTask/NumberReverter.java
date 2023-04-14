package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        StringBuilder stringNumber = new StringBuilder();
        stringNumber.append(number);
        stringNumber.reverse();
        System.out.println(stringNumber.toString());
    }
}
