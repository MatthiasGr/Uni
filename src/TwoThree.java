public class TwoThree extends MiniJava
{
    public static void main(String[] args)
    {
        int i1, i2, sum , prevsum;
        int __break;
        int counter;

        sum = 0;
        __break = 0;
        counter = -1;
        while(__break == 0)
        {
            counter++;
            prevsum = sum;

            i1 = dice();
            i2 = dice();

            if(i1 > i2) sum = i1 * 10 + i2; else sum = i2 * 10 + i1;

            if(sum == 21)
            {
                if (counter % 2 == 0) write("Computer has won");
                else write("Player has won");
                __break = 1;
            }
            else
                {

                if (i1 == i2) sum = sum * 100;

                if (prevsum > sum)
                {
                    if ((counter - 1) % 2 == 0) write("Computer has won");
                    else write("Player has won");
                    __break = 1;
                }
            }
            write(String.format("DEBUG: sum was %d", sum));
        }
    }
}
