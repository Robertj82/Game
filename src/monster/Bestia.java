package monster;

import java.util.Random;

public class Bestia extends Monster {
    public Bestia() {
        super( 20, 50, "Bestia",3,32);


    }
    public int attack(){
        Random random = new Random();
       return random.nextInt(getAttack());
    }
}