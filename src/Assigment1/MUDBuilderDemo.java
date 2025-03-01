public class MUDBuilderDemo {
    public static void main(String[] args) {
        // Создаем строителя
        IDungeonBuilder builder = new SimpleDungeonBuilder();

        // Строим подземелье
        Dungeon dungeon = builder
                .setDungeonName("Пещера Черного Дракона")
                .addRoom(new Room("Вход", "Темный и сырой вход в пещеру."))
                .addRoom(new Room("Зал Дракона", "Огромная комната с каменным троном."))
                .addNPC(new NPC("Черный Дракон", "Старый и грозный дракон."))
                .addNPC(new NPC("Стражник", "Охраняет вход в зал."))
                .build();

        // Выводим результат
        System.out.println(dungeon);
    }
}
