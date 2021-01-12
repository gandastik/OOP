public class  lab101
{
    public static void main(String[] args)
    {
        int currentPop = 312032486;
        int yearInSec = 60 * 60 * 24 * 365;
        int bornInYear = yearInSec / 7;
        int deadInYear = yearInSec / 13;
        int immigrantInYear = yearInSec / 45;
        for(int i=0;i<6;i++)
        {
            int newPopEachYear = bornInYear - deadInYear + immigrantInYear;
            currentPop += newPopEachYear;
            System.out.println("Year number : " + i + " Has current Population of : " + currentPop);
        }
    }
}
