public class FunctionalInterface
{

    @java.lang.FunctionalInterface
    interface Multiplier
    {
        int multiply(int i,int j);
    }

    public static void main(String[] args)
    {
        int x = 10 ;
        int y = 20;
        FunctionalInterface client = new FunctionalInterface();
        Multiplier m = (a , b) -> a*b;
        System.out.println(m.multiply(20,30));
    }
}