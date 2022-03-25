public class TargetType
{
    public interface Email
    {
        String constructEmail(String mail);
    }


    public static void main(String[] args)
    {
        Email E = (String s) -> "Email is : " + s;
        System.out.println( E.constructEmail("jack@gmail.com"));
    }
}