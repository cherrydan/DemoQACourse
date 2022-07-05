package Auction;

public class Human {

    public void checkThing(TypeMachine tm){
        tm.write();
    }

    //тоже перегрузка метода
    public void checkThing(WritingThings wthing) {
        wthing.write();
    }

    //реализация записи информации о предмете1
    public void writeInfo(WritingThings wt) {
        System.out.printf("Цена: %.2f Название: %s\n", wt.getPrice(), wt.getName());
    }

    //Перегрузка метода с другими параметрами
    //реализация записи информации о предмете2
    public void writeInfo(TypeMachine tm) {
        System.out.printf("Цена: %.2f Название: %s\n", tm.getPrice(), tm.getName());
    }

}
