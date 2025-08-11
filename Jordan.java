public class Jordan {
    public static void main(String[]args)
    {
        int [][]table= new int[5][5];
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
                {
                    if(i==j)
                    {
                        table[i][j]=1;
                    }
                    else
                    {
                        table[i][j]=0;
                    }
                }
        }
        System.out.println("\n");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(table[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}