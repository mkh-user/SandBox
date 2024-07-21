public class HundredthPrime
{
    public static void main(String[] args)
    {
        int NowNumber = 2;
        int counter = 0;
        int Target = 100;
        while (counter < Target) {
            for (int i = 2; i <= NowNumber; i++) {
                if (i == NowNumber) {
                    counter++;
                } else if (NowNumber % i == 0) {
                    break;
                }
            }
            NowNumber++;
        }
        System.out.println(--NowNumber);
    }
}