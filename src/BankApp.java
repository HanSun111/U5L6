import java.util.concurrent.Callable;

public class BankApp {
    private String name;
    private Bank laScam;
    private BagelShop bunsWithHoles;
    private CreditCard firstCard;
    private String password;

    public BankApp(String name, String shop, int inventory, int price, String cardPin){
        this.name = name;
        laScam = new Bank();
        bunsWithHoles = new BagelShop(shop, inventory, price, laScam);
        firstCard = new CreditCard(this.name, cardPin);
    }
    public void choices(int imDyingItsLateHairLineRetreating) {
        int condition = 15;
        while (condition != 15) {
            CreditCard second = null;
            if (imDyingItsLateHairLineRetreating == 1) {
                while(second == null) {
                    bunsWithHoles.payForBagels(firstCard, );
                }
            }
            if (imDyingItsLateHairLineRetreating == 2) {
                while(second == null) {
                    bunsWithHoles.returnBagels(firstCard, )
                }
            }
            if (imDyingItsLateHairLineRetreating == 3) {

            }
            if (imDyingItsLateHairLineRetreating == 4) {
                for (int i = 0; i != 1; i++) {
                    second = new CreditCard(name, password);
                }

            }
            if (imDyingItsLateHairLineRetreating == 5) {
                laScam.lowerBalance(firstCard, second);
            }
            if (imDyingItsLateHairLineRetreating == 6) {
                condition = 15;
            }
        }
    }

}
