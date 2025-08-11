public class Bit {
    public static void main(String[]args)
    {
        char c='A';
        byte b=100;
        short s=100;
        int i=-100;
        long l=100;
        System.out.println(c&0xf);
        System.out.println(b|1);
        System.out.println(s^1);
        System.out.println(~i);
        System.out.println(10|1);
        System.out.println(i>>2);
        System.out.println(s>>2);
        System.out.println(i<<2);
    }
}