package Auction;

public class Customer extends Human {
    //Класс Покупатель - покупатель имеет деньги на счёте, может проверять товар (так как он наследуется от Human),
    //и может совершать покупки (при этом деньги на счёте убывают, а покупка совершается не только тогда, когда товар
    //исправен, но и тогда, когда на счету достаточно денег

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    private final String  name;

    public String getName() {
        return name;
    }

    public void getCustomerInfo() {
        System.out.printf("Покупатель: %s Счёт: %.2f USD\n", getName(), getAmount());
    }

    public void buy(TypeMachine tm) {
        if(tm.getGoodTyping() && amount >= tm.getPrice()) {
            amount = amount - tm.getPrice();
            System.out.println("Покупка совершена. Счёт покупателя обновлён");
            setAmount(amount);
        }
        else {
            System.out.println("Покупателю не хватает денег, или товар сломан");
        }
    }

    public void buy(WritingThings wt) {
        if(wt.getGoodWriting() && amount >= wt.getPrice()) {
            amount = amount - wt.getPrice();
            System.out.println("Покупка совершена. Счёт покупателя обновлён");
            setAmount(amount);
        }
        else {
            System.out.println("Покупателю не хватает денег, или товар сломан");
        }
    }


    public Customer(double amount, String name) {
        this.amount = amount;
        this.name = name;

    }
}
