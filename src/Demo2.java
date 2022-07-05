public class Demo2 {
//Пересчитываем температуру заданую в Цельсиях (36.6) в Фаренгейтах и Кельвинах
    public static void main(String[] args) {

        Double tC = 36.6;
        System.out.println("Температура по Фаренгейту: " + (tC * 1.8 + 32));
        System.out.println("Температура по Кельвину: " + (tC + 273.15));
    }
}
