public class MUDBuilderDemo {
    public static void main(String[] args) {
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Темная пещера")
                .addRoom(new Room("Вход", "Темный и страшный вход."))
                .addNPC(new NPC("Гоблин", "Маленькое зеленое существо."))
                .build();

        System.out.println(dungeon);
    }
}
