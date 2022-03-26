public class Main
{
    public static void main(String[] args)
    {

        for (int i = 0, counts = 0; counts <= 400; i++)
        {
            if (i % 13 == 0)
            {
                System.out.println(i);
                counts++;
            }
        }
    }
}
