public class MUDPrototypeDemo {
    public static void main(String[] args) {
        // Создаем оригинальные объекты
        Room originalRoom = new Room("Тронный зал", "Большой зал с золотым троном.");
        NPC originalNPC = new NPC("Король-Призрак", "Призрачный правитель подземелья.", 100);

        // Клонируем объекты
        Room clonedRoom = originalRoom.cloneEntity();
        NPC clonedNPC = originalNPC.cloneEntity();

        // Изменяем клонированный объект, чтобы показать, что это независимая копия
        clonedNPC = new NPC("Рыцарь-призрак", "Тень павшего рыцаря.", 75);

        // Выводим результаты
        System.out.println("=== Оригинальные объекты ===");
        System.out.println(originalRoom);
        System.out.println(originalNPC);

        System.out.println("\n=== Клонированные объекты ===");
        System.out.println(clonedRoom);
        System.out.println(clonedNPC);
    }
}
