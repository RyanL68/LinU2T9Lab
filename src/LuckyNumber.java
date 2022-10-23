public class LuckyNumber {
    /* No instance variables */

    /* "empty" constructor with no parameters */
    public LuckyNumber() {
    }

    /* Generates a random number between min and max, inclusive,
       and returns that random number
     */
    public int randomIntegerBetween(int min, int max) {
        int random = (int)(Math.random()*(max-min+1))+min;
        return random;
        /* implement this method!  */
    }

    /* Generates and returns a String containing lucky numbers!

       For this lucky number game, there are 5 balls randomly drawn,
       each between 1 and 65, and one "super ball" between 1 and 30.

       In this game, the same number CAN appear more than once.

       The returned String should have the 6 numbers listed (they do not
       need to be in ascending order): 5 "lucky numbers" between 1 and 65,
       and the last one, the "super ball," between 1 and 30.
       See samples below.

       This method should call your randomIntegerBetween method above multiple times --
        don't rewrite the same code over and over to generate multiple random numbers,
        use your method!
      */
    public String getLuckyNumbers() {
        String Luckynumber1 = String.valueOf(randomIntegerBetween(1,65));
        String Luckynumber2= String.valueOf(randomIntegerBetween(1,65));
        String Luckynumber3 = String.valueOf(randomIntegerBetween(1,65));
        String Luckynumber4 = String.valueOf(randomIntegerBetween(1,65));
        String Luckynumber5 = String.valueOf(randomIntegerBetween(1,65));
        String superball = String.valueOf(randomIntegerBetween(1,30));
      System.out.println("Your Lucky Numbers are "+Luckynumber1+" "+Luckynumber2+" "+Luckynumber3+" "+Luckynumber4+" "+Luckynumber5);
      System.out.println("Your super ball number is "+superball);
      return null;
    }
}
