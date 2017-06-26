package kz.alfabank.statement;

/**
 * Created by Kuan on 25.06.2017.
 */
public class Transaction {
    private Double amount;

    public Transaction() {
        this.amount = Math.random() * 1000000;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
