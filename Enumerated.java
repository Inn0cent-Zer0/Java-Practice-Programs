public class Enumerated {
    enum Days
    {
        Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
    }

    public static void main(String[]args)
    {
        for(Days d:Days.values())
        {
            weekend(d);
        }
    }
    private static void weekend(Days d)
    {
        if(d.equals(Days.Sunday)||d.equals(Days.Saturday))
        {
            System.out.println( "Value =  \t"+d+" is a Holiday\n\t\tEnjoy Well");
        }
        else
        {
            System.out.println( "Value =  \t"+d+" is a Workday");
        }
    }
}