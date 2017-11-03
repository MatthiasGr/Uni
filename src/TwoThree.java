public class TwoThree extends MiniJava
{
    public static void main(String[] args)
    {
        int i1, i2, sum;
        i1 = dice();
        i2 = dice();

        sum = i1 > i2 ? i1 * 10 + i2 : i2 * 10 + i1;

    }
}
