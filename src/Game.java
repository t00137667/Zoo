public class Game {

    public static void main(String[] args) {

        // Create two dice objects

        Die die1 = new Die();
        Die die2 = new Die();

        int resultDie1 = die1.roll();
        int resultDie2 = die2.roll();
        int total = resultDie1+resultDie2;

        if (resultDie1 + resultDie2 == 7){
            System.out.println(resultDie1 + " and " + resultDie2 + " equals " + total + "\nYou Win!!");
        }
        else{
            System.out.println(resultDie1 + " and " + resultDie2 + " equals " + total + "\nSorry, You Didn't Win!!");
        }


    }


}
