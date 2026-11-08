public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += (int)(health * 0.10);
                break;
            case 2:
                health += (int)(health * 0.30);
                break;
            case 3:
                health += (int)(health * 0.40);
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= (int)(health * 0.02);

        if (health < 0) {
            health = 0;
        }
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data =\n"
                + "Health = " + health + "\n"
                + "Level = " + level;
    }
}