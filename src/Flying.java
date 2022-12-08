import java.util.Objects;

public class Flying extends Birds {
    private final String typeOfMovement;

    public Flying(String name, int year, String environmentObit, String typeOfMovement) {
        super(name, year, environmentObit);
        if (typeOfMovement == null || typeOfMovement.isEmpty()) {
            this.typeOfMovement = "Земля";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }

    public void fly() {
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return typeOfMovement.equals(flying.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }

    @Override
    public String toString() {
        return "Летающие: " +
                "Птица: " + name + '\n' +
                "Среда рбитания: " + getEnvironmentObit() + '\n' +

                "Возраст" + year
                ;
    }
}
