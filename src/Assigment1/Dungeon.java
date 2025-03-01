import java.util.ArrayList;
import java.util.List;

public class Dungeon {
    private String name;
    private List<Room> rooms;
    private List<NPC> npcs;

    public Dungeon(String name, List<Room> rooms, List<NPC> npcs) {
        this.name = name;
        this.rooms = new ArrayList<>(rooms);
        this.npcs = new ArrayList<>(npcs);
    }

    @Override
    public String toString() {
        return "Подземелье: " + name + "\nКомнаты: " + rooms + "\nNPC: " + npcs;
    }
}
