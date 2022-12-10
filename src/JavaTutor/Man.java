package JavaTutor;

//Показываем пример использования интерфейса Comparable
public record Man(int id, String name) implements Comparable<Man> {
    //обязательный метод для перегрузки

    @Override
    public int compareTo(Man m) {

        return Integer.compare(this.id - m.id, 0); //не менять местами, они и так в порядке возрастания

    }

}
