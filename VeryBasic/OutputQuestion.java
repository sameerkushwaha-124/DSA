package VeryBasic;

public class OutputQuestion
{
    int x = 11;
    void modifyValue(int val) {
        x = val * 2;
    }
    int getValue() {
        return x;
    }
    public static void main(String[] args) {
        OutputQuestion obj1 = new OutputQuestion();
        OutputQuestion obj2 = obj1;
        OutputQuestion obj3 = new OutputQuestion();

        obj3.modifyValue(7);
        System.out.println("obj1 value: " + obj1.getValue());
        obj2.modifyValue(5);
        System.out.println("obj2 value: " + obj2.getValue());
        System.out.println("obj3 value: " + obj3.getValue());
    }
}
