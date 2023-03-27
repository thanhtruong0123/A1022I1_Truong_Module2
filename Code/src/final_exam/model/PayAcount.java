package final_exam.model;

public class PayAcount extends Acount {
    private String cardNumber;
    private long money;

    public PayAcount() {

    }

    public PayAcount(String cardNumber, long money) {
        this.cardNumber = cardNumber;
        this.money = money;
    }

    public PayAcount(int id, String acountId, String name, String createDay, String cardNumber, long money) {
        super(id, acountId, name, createDay);
        this.cardNumber = cardNumber;
        this.money = money;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "PayAcount{" +
                "cardNumber='" + cardNumber + '\'' +
                ", money=" + money +
                '}';
    }
}
