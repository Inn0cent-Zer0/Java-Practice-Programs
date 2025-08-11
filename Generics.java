public class Generics {
    public static <E> void print(E[] input) {
        System.out.print("{");
        for (E element : input) {
            System.out.printf("%s", element);
            System.out.print(",");
        }
        System.out.print(" ");
        System.out.print("}");
    }
    public static void main(String[]args)
    {
        Integer[] integers={1,2,3,4,5,6,7,8,9,0};
        double[] doubles={1.0,1.2,1.3,1.4,2.5};
        Character[] characters={'R','A','M','G','A','N','U'};
        System.out.println("Integer Array");
        print(integers);
       /* System.out.println("Double Array");
        print(doubles);*/
        System.out.println("Character Array");
        print(characters);

    }
}