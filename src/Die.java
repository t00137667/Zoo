public class Die {
    // Set the number sides on the die
    private int numSides = 6;

    // 
    public int roll(){
        return 1 + (int)(Math.random()*numSides);
    }

}
