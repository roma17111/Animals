import java.util.Objects;

public class Predator extends Mammal{

    String typeOfFood;

    public Predator(String name, int year, String environmentObit, String typeOfFood) {
        super(name, year, environmentObit);
        this.typeOfFood = typeOfFood;
    }

    public void hunt() {

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
        Predator predator = (Predator) o;
        return typeOfFood.equals(predator.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Predator{" +
                "typeOfFood='" + typeOfFood + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

}
