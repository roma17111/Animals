import java.util.Objects;

public  abstract class Animals {

    String name;
    int year;

    public Animals(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public abstract void eat();

    public void sleep() {
    }
    public abstract void go();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return year == animals.year && name.equals(animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
