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
    }
}