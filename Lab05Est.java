public class Lab05Est
{
    public static void main(String args[])
    {
        System.out.println("Lab 05E");
        System.out.println();
        System.out.print("What is the posted speed limit?  -->  ");
        int speedLimit = Expo.enterInt();
        System.out.println();
        System.out.print("How fast was the car travelling in mph?  -->  ");
        int trueSpeed = Expo.enterInt();
        System.out.println();
        int ticketPrice;
        if(trueSpeed > speedLimit)
        {
            ticketPrice = 75;
            int speedOver = trueSpeed - speedLimit;
            if(speedOver > 30)
            {
                ticketPrice += 160;
            }
            ticketPrice += speedOver*6;
            System.out.print("Did the violation occur in a school zone?  {Y/N}  -->  ");
            char inSchoolZone = Expo.enterChar();
            switch(inSchoolZone)
            {
                case 'Y' : System.out.println();
                ticketPrice += ticketPrice;break;
                case 'N' : System.out.println();
                ticketPrice = ticketPrice;break; 
            }
            System.out.println();
            System.out.println("Ticket amount: $" + ticketPrice + ".");
        }
        else
        System.out.print("No violation. No fine will be given.");
    }
}
