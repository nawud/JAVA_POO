package Dragon_ball;

public class Characters {
    private String name;
    private long power;
    private String world;
    private String race;

    public Characters(String name, long power, String world, String race) {
        this.name = name;
        this.power = power;
        this.world = world;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPower() {
        return power;
    }

    public void setPower(long power) {
        this.power = power;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }


}

