public class Pow {

    public static int myPow(int x, int y)
    {
        int result;


        if(y == 0)
        {
            result = 1;
        }

        else if(y == 1)
        {
            result = x;
        }

        else
        {
            result = x * myPow(x,y-1);
        }

        return result;


    }
}
