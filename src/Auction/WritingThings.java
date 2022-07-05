package Auction;

public class WritingThings extends Things implements Write{

    private Boolean goodWriting = true;

    public Boolean getGoodWriting() {
        return goodWriting;
    }

    public void setGoodWriting(Boolean goodWriting) {
        this.goodWriting = goodWriting;
    }

    @Override
    public void write() {
        if(getGoodWriting()) {
            System.out.println("Пишет хорошо!");
        }
        else {
            System.out.println("Не пишет!");
        }
    }

    public WritingThings(double price, String name) {
        super(price, name);
    }



}
