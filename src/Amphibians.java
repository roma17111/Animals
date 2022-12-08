import java.util.Objects;

public class Amphibians extends Animals{

    private String environmentObit;

    public Amphibians(String name, int year, String environmentObit) {
        super(name, year);
        this.environmentObit = environmentObit;
    }

    public void hunt() {
    }

    public String getEnvironmentObit() {
        return environmentObit;
    }

    public void setEnvironmentObit(String environmentObit) {
        this.environmentObit = environmentObit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return environmentObit.equals(that.environmentObit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), environmentObit);
    }

    @Override
    public String toString() {
        return "Amphibians{" +
                "environmentObit='" + environmentObit + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
