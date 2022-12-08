public class Main {
    public static void main(String[] args) {

        Herbivores gazelle = new Herbivores("Газель", 12,
                null, 34, "цветочки");
        Herbivores giraffe = new Herbivores("Жираф", 16, "леса и поля",
                56, "трава, растения");
        Herbivores horse = new Herbivores("Лошадь", 5,
                "Конюшня, луга, поля", 45, "Сено отборное");
        System.out.println(horse);
        System.out.println(giraffe);
        System.out.println(gazelle);

        Predator giena = new Predator("Гиена", 22,
                null, 44, "Мясо");
        Predator tiger = new Predator("тигр", 2,
                null, 14, "Мясо");
        Predator bear = new Predator("медведь", 14,
                "леса", 14, "Мясо");
        System.out.println(giena);
        System.out.println(tiger);
        System.out.println(bear);

        Amphibians frog = new Amphibians("Лягушка", 1, "Водоём");
        Amphibians snake = new Amphibians("Уж пресноводный", 3, "озеро или речка");
        System.out.println(frog);
        System.out.println(snake);

        Flightless pavlin = new Flightless("Павлин", 5, "тёплые края",
                "По земле");
        Flightless pinguin = new Flightless("Пингвин", 5, "Антарктика",
                "По земле");
        Flightless dodo = new Flightless("Птица додо", 5, "Жаркие страны",
                "По земле");
        System.out.println(dodo);
        System.out.println(pavlin);
        System.out.println(pinguin);
    }
}