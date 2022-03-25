public class FunctionalInterfaceAnnotation
{

    interface Cruncher
    {
        int crunch(int i,int j);
    }

    public int crunchService(int i,int j,Cruncher cruncher)
    {
        return cruncher.crunch(i,j);
    }

    public static void main(String[] args)
    {
        FunctionalInterfaceAnnotation client = new FunctionalInterfaceAnnotation();

        int ans = client.crunchService(3,4,(p,q)->p*q);
        System.out.println("Answer: "+ans);

        ans = client.crunchService(3,4,(p,q)->p+q);
        System.out.println("Answer: "+ans);

        ans = client.crunchService(3,4,(p,q)->p-q);
        System.out.println("Answer: "+ans);

        ans = client.crunchService(20,4,(p,q)->p/q);
        System.out.println("Answer: "+ans);
    }
}