package Auction;
//На аукционе продают различные экспонаты: 2 печатные машинки, одну ручку и один карандаш
//ведущему аукциона перед его началом нужно записать информацию о каждом экспонате
//сколько он стоит и как называется. Также он должен проверить работоспособность экспоната

//TODO: Добавить класс "Покупатель", который будет иметь некую сумму денег и возможность покупать товары
//Сумма после покупки должна списываться со счета Покупателя


public class Main {

    public static void main(String[] args) {
        TypeMachine tm1 = new TypeMachine(99.99, "Gloria");
        TypeMachine tm2 = new TypeMachine(120.50, "Elsa");

        WritingThings pen = new WritingThings(1.99, "Comus");
        WritingThings pencil = new WritingThings(2.99, "Kohinor");

        Human performer = new Human();
        performer.checkThing(tm1);
        performer.writeInfo(tm1);
        System.out.println();

        performer.checkThing(tm2);
        performer.writeInfo(tm2);
        System.out.println();

        pen.setGoodWriting(false);
        performer.checkThing(pen);
        performer.writeInfo(pen);
        System.out.println();

        performer.checkThing(pencil);
        performer.writeInfo(pencil);

        System.out.println();

        Customer customer1 = new Customer(300, "Alex");

        customer1.checkThing(tm2);
        customer1.writeInfo(tm2);
        customer1.getCustomerInfo();
        customer1.buy(tm2);
        customer1.getCustomerInfo();

        System.out.println();
        Customer customer2 = new Customer(100, "Mary");
        customer2.getCustomerInfo();
        customer2.buy(pen);
        System.out.println();
        customer2.buy(pencil);
        customer2.getCustomerInfo();
        System.out.println();

        Customer customer3 = new Customer(80, "Bobby");
        customer3.getCustomerInfo();
        customer3.buy(tm1);

    }
}
