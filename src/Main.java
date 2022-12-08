import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Herbivores gazelle = new Herbivores("Газель", 12,
                null, 34, "цветочки");
        Herbivores giraffe = new Herbivores("Жираф", 16, "леса и поля",
                56, "трава, растения");
        Herbivores horse = new Herbivores("Лошадь", 5,
                "Конюшня, луга, поля", 45, "Сено отборное");
        Herbivores[] herbivores = {gazelle, giraffe, horse};
        System.out.println(horse);
        System.out.println(giraffe);
        System.out.println(gazelle);

        Predator giena = new Predator("Гиена", 22,
                null, 44, "Мясо");
        Predator tiger = new Predator("тигр", 2,
                null, 14, "Мясо");
        Predator bear = new Predator("медведь", 14,
                "леса", 14, "Мясо");
        Predator [] predator = {giena, tiger, bear};
        System.out.println(giena);
        System.out.println(tiger);
        System.out.println(bear);

        Amphibians frog = new Amphibians("Лягушка", 1, "Водоём");
        Amphibians snake = new Amphibians("Уж пресноводный", 3, "озеро или речка");
        Amphibians[] amphibians = {snake, frog};
        System.out.println(frog);
        System.out.println(snake);

        Flightless pavlin = new Flightless("Павлин", 5, "тёплые края",
                "По земле");
        Flightless pinguin = new Flightless("Пингвин", 5, "Антарктика",
                "По земле");
        Flightless dodo = new Flightless("Птица додо", 5, "Жаркие страны",
                "По земле");
        Flightless[] flightless = {pavlin, pinguin, dodo};
        System.out.println(dodo);
        System.out.println(pavlin);
        System.out.println(pinguin);
        Flying chayka = new Flying("Чайка", 3,
                "Средняя полоса", "Летающая");
        Flying albatros = new Flying("Альбатрос", 2,
                "Средняя полоса", "Летающая");
        Flying sokol= new Flying("сокол", 1,
                "Средняя полоса", "Летающая");
        Flying[] flying = {sokol, albatros, chayka};
        System.out.println(sokol);
        System.out.println(chayka);
        System.out.println(albatros);

        System.out.println(gazelle.equals(giraffe));
        System.out.println(gazelle.equals(horse));
        System.out.println(horse.equals(giraffe));
        System.out.println(flying.equals(flightless));
        System.out.println(predator.equals(amphibians));

    }
  }