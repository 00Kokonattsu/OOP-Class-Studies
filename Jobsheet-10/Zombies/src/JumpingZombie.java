public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += (int)(health * 0.30);
                break;
            case 2:
                health += (int)(health * 0.40);
                break;
            case 3:
                health += (int)(health * 0.50);
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= (int)(health * 0.01);

        if (health < 0) {
            health = 0;
        }
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data =\n"
                + "Health = " + health + "\n"
                + "Level = " + level;
    }
}