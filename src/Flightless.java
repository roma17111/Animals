import java.util.Objects;

public class Flightless extends Birds {
    private final String typeOfMovement;

    public Flightless(String name, int year, String environmentObit, String typeOfMovement) {
        super(name, year, environmentObit);
        if (typeOfMovement == null || typeOfMovement.isEmpty()) {
            this.typeOfMovement = "Небо";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }

    public void walk() {
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return typeOfMovement.equals(that.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }

    @Override
    public String toString() {
        return "Нелетающие: " +
                "Тип перемещения:" + typeOfMovement + '\'' +
                "Животное: " + name + '\'' +
                ",Возраст: " + year + '\n' +" Среда обитания: "
                + getEnvironmentObit()
                ;
    }
}

