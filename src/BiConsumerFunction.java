import java.util.function.BiConsumer;

public class BiConsumerFunction
{
    BiConsumer<Integer,Integer> empBonusConsumer =
            (emp,bonus)-> System.out.printf("Employee %s has received bonus of %dk ", emp,bonus);

    BiConsumer<Integer,Integer> empSalaryHikeConsumer =
            (emp,sal)-> System.out.printf("Employee %s is receiving  %d hike in salary", emp,sal);

    BiConsumer<Integer,Integer> empBonusAndHikeConsumer = empBonusConsumer.andThen(empSalaryHikeConsumer);

    private void testBiConsumer(int emp, Integer bonus, Integer salaryHike)
    {
        empBonusConsumer.accept(emp,bonus);
    }

    private void testBiConsumer(int emp, Integer salaryHike)
    {
        empSalaryHikeConsumer.accept(emp,salaryHike);
    }

    public static void main(String[] args)
    {
        int emp = 10;
        int bonus = 5;
        int salaryHike =15;
        new BiConsumerFunction().testBiConsumer(emp,bonus,salaryHike);
        System.out.println();
        new BiConsumerFunction().testBiConsumer(emp,salaryHike);
    }


}