import java.util.Objects;

public class Predator extends Mammal {

    private final String typeOfFood;

    public Predator(String name, int year, String environmentObit, int speedMove, String typeOfFood) {
        super(name, year, environmentObit, speedMove);
            if (typeOfFood == null || typeOfFood.isEmpty()) {
                this.typeOfFood = "Мясо";
            } else{
                this.typeOfFood = typeOfFood;
            }

}

    public void hunt() {

    }

    public String getTypeOfFood() {
        return typeOfFood;
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
        return "Млекопетающие: " +
                "Животное: " + name + '\n' +
                "Тип еды: " + typeOfFood + '\n' +

                "Возраст: " + year
                ;
    }

}
