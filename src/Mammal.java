import java.util.Objects;

public class Mammal extends Animals {

    private final String environmentObit;
    private int speedMove;

    public Mammal(String name, int year, String environmentObit, int speedMove) {
        super(name, year);
        if (environmentObit == null || environmentObit.isEmpty()) {
            this.environmentObit = "Суша";
        } else {
            this.environmentObit = environmentObit;
        }setSpeedMove(speedMove);
    }

    public void walk() {
    }

    public String getEnvironmentObit() {
        return environmentObit;
    }


    public int getSpeedMove() {
        return speedMove;
    }

    public void setSpeedMove(int speedMove) {
        if (speedMove < 0 || speedMove > 100) {
            this.speedMove = 30;
        } else {
            this.speedMove = speedMove;
        }
    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {

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
