import java.util.Objects;

public class Mammal extends Animals{

    private String environmentObit;
    private int speedMove;

    public Mammal(String name, int year, String environmentObit) {
        super(name, year);
        this.environmentObit = environmentObit;
    }

    public void walk() {
    }

    public String getEnvironmentObit() {
        return environmentObit;
    }

    public void setEnvironmentObit(String environmentObit) {
        this.environmentObit = environmentObit;
    }

    public int getSpeedMove() {
        return speedMove;
    }

    public void setSpeedMove(int speedMove) {
        this.speedMove = speedMove;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return speedMove == mammal.speedMove && environmentObit.equals(mammal.environmentObit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), environmentObit, speedMove);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "environmentObit='" + environmentObit + '\'' +
                ", speedMove=" + speedMove +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
