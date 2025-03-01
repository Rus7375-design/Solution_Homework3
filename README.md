Описание

Этот проект демонстрирует использование паттерна проектирования Prototype в контексте MUD-игры. Прототип используется для создания копий игровых объектов, таких как комнаты (Assigment2.Room) и Assigment2.NPC (Assigment2.NPC).

Структура проекта

📂 src/
├── 📄 Assigment2.CloneableGameEntity.java  # Интерфейс для клонирования
├── 📄 Assigment2.Room.java                 # Класс комнаты с поддержкой клонирования
├── 📄 Assigment2.NPC.java                  # Класс Assigment2.NPC с поддержкой клонирования
└── 📄 Assigment2.MUDPrototypeDemo.java     # Демонстрационный класс

Реализованные функции

Интерфейс Assigment2.CloneableGameEntity для всех клонируемых сущностей.

Assigment2.Room и Assigment2.NPC, реализующие интерфейс Assigment2.CloneableGameEntity.

Метод cloneEntity(), создающий точную копию объекта.

Демонстрация клонирования в Assigment2.MUDPrototypeDemo.java.