package factoryPattern;

/**
 * Created by jacka on 3/24/2016.
 */
public abstract class EnemyShip {

    private String name;
    private double amtDamage;

    public String getName() {return name;}

    public void setName(String newName) { name = newName; }

    public double getDamage() {return amtDamage; }

    public void setAmtDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }

    public void followHeroShip() {
        System.out.println(getName() +  " is following the here");


    }

    public void enemyShipShoots() {
        System.out.println(getName() + " attacking and does "  + getDamage() );
    }
}
