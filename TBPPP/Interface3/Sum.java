package TBPPP.Interface3;

@FunctionalInterface
interface Add {
    int add(int a, int b);
}

public class Sum {
    public static void main(String[] args) {
        // Lambda expression with an implicit return (no "return" keyword needed for single expression)
        Add obj = (int d, int c) -> d + c; // Directly return the sum of d and c

        // Output the result of the add method
        System.out.println(obj.add(2, 3));  // Output: 5
    }
}
