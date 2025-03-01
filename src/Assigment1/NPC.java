public class NPC {
    private String name;
    private String description;

    public NPC(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return name + " (" + description + ")";
    }
}
