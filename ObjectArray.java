public class ObjectArray {
    public static void main(String[]args) throws Exception
    {
        Object []array= new Object[5];
        array[0]=new Integer[5];
        array[1]= new Character['a'];
        array[2]= new Boolean[0];

        for(int i=0;i< array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}