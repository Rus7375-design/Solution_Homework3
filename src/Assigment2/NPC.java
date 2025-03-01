package Assigment2;

public class NPC implements CloneableGameEntity {
    private String name;
    private String description;
    private int health;

    public NPC(String name, String description, int health) {
        this.name = name;
        this.description = description;
        this.health = health;
    }

    @Override
    public NPC cloneEntity() {
        return new NPC(this.name, this.description, this.health);
    }

    @Override
    public String toString() {
        return "Assigment2.NPC: " + name + " (" + description + "), Здоровье: " + health;
    }
}
