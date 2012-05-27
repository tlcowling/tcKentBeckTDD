public class Dollar extends Money{
    private String currency;

    public Dollar(int amount) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public String currency(){
        return "USD";
    }

}
