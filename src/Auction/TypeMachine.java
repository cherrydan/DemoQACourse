package Auction;

public class TypeMachine extends Things implements Write {

    private Boolean goodTyping = true;

    public Boolean getGoodTyping() {
        return goodTyping;
    }

    public void setGoodTyping(Boolean goodTyping) {
        this.goodTyping = goodTyping;
    }

    @Override
    public void write() {
        if(getGoodTyping()) {
            System.out.println("Печатает хорошо!");
        }
        else {
            System.out.println("Не печатает, сломана!");
        }
    }

    public TypeMachine(double price, String name) {
        super(price, name);
    }
}
