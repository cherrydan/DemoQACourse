package JavaTutor;

public class Men implements Comparable<Men> {
    private int id;
    private final String name;

    public Men(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }


    //Метод сравнения, обязательный к реализации для интерфейса Comparable
    @Override
    public int compareTo(Men m) {
        return Integer.compare(this.id - m.id, 0);

    }

    // перепишем метод toString чтобы он выводил данные из нашего класса так, как нам нужно
    @Override
    public String toString() {
        return "Id " + getId() + " Name " + getName();
    }
}
