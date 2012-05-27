public class Money {
    protected int amount;
    protected String currency;

    public boolean equals(Object object){
        Money money = (Money)object;
        return amount == money.amount &&
                currency().equals(money.currency());
    }

    public String toString(){
        return amount + " " + currency;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money franc(int amount) {
        return new Franc(amount);
    }

    public Money times(int multiplier){
        return null;
    }

    public String currency(){
        return currency;
    }
}
