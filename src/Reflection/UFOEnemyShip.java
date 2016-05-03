package Reflection;

/**
 * Created by jacka on 3/24/2016.
 */
public class UFOEnemyShip extends EnemyShip {

    private String incode = "100";


    private String getPrivate() {
        return "How did you get this";
    }

    private String getOtherprivate (int thisInt, String thatString) {
        return "How did you get here " + thisInt + " " + thatString;
    }

    public  UFOEnemyShip(int number, String randString) {
        System.out.println("You sent: " + number + " " + randString);
    }

    
    /**
     * The constructor.
     */
    public UFOEnemyShip() {
        setName("UFO Enemy Ship ");

        setAmtDamage(100);
    }
}
