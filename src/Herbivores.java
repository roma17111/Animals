import java.util.Objects;

public class Herbivores extends Mammal {
    String typeOfFood;

    public Herbivores(String name, int year, String environmentObit, String typeOfFood) {
        super(name, year, environmentObit);
        this.typeOfFood = typeOfFood;
    }

    public void graze() {
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
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
