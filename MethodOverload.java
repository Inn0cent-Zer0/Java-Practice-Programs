public class MethodOverload {
    public void testOverLoadedMethods() {
        System.out.printf("Square of integer 7 is %d\n", square(7));
        System.out.printf("Square of integer 7.5 is %f\n", square(7.5));
    }

    private int square(int intValue) {
        System.out.printf("\n Called square with double arguement %f\n", intValue);
        return intValue * intValue;
    }

    private double square(double doubleValue) {
        System.out.printf("\n Called square with double arguement %f\n", doubleValue);
        return doubleValue * doubleValue;
    }

}