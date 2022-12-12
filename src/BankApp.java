public class BankApp {
    private String name;
    private BagelShop bunsWithHoles;

    public BankApp(String name, String shop, int inventory, int price, String cardPin){
        this.name = name;
        Bank laScam = new Bank();
        bunsWithHoles = new BagelShop(shop, inventory, price, laScam);
        CreditCard firstCard = new CreditCard(this.name, cardPin);
    }
    public void pays(CreditCard cards, int quantity, String cardPin){
        bunsWithHoles.payForBagels(cards, quantity, cardPin);
    }

    public void returns(CreditCard cards, int quantity, String cardPin){
        bunsWithHoles.returnBagels(cards, quantity, cardPin);
    }

}
