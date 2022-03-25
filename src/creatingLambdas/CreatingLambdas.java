package creatingLambdas;

public class CreatingLambdas
{
    interface Greetings
    {
        String greet(String g);
    }

    public void testGreeting(String s , Greetings g)
    {
        String result = g.greet(s);
        System.out.println("Result: " + result);
    }

    public static void main(String[] args)
    {
        CreatingLambdas c = new CreatingLambdas();
        c.testGreeting("harry", (String g) -> "Hello " + g);
        c.testGreeting("aj", (String g) -> "Hello " + g);

        c.testGreeting( "", (String g) -> !g.isEmpty()? "heya " + g : "Did you miss something? ");

    }
}
