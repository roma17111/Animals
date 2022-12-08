import java.util.Objects;

public class Herbivores extends Mammal {
    private final String typeOfFood;

    public Herbivores(String name, int year, String environmentObit, int speedMove, String typeOfFood) {
        super(name, year, environmentObit, speedMove);
        if (typeOfFood == null || typeOfFood.isEmpty()) {
            this.typeOfFood = "Травка";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public void graze() {
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return typeOfFood.equals(that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                "typeOfFood='" + typeOfFood + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
