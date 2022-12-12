import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("input a name: ");
        String name = s.nextLine();
        System.out.println("input a name for bagel shop: ");
        String bagelName = s.nextLine();
        System.out.println("input the inventory for bagel shop: ");
        int amount = s.nextInt();
        System.out.println("input price you charge per bagel: ");
        int price = s.nextInt();
        System.out.println("input a pin for new credit card");
        String password = s.nextLine();

        BankApp app = new BankApp(name, bagelName, amount, price, password);
        System.out.println("press 1 to see menu, 2 to stop");
        int choice = s.nextInt();
        for(int i = 0; choice != 2; i++){
            System.out.println("MENU\n1. Purchase Bagel\n2. Return bagel\n3. Open Second Card or choose card to pay");
            int moreChoices = s.nextInt();
            if(moreChoices == 1){
                if(i == 0){

                }
                app.pays();
            }
            if(moreChoices == 2){

            }
            if(moreChoices == 3){
                for(int j = 0; j==1; j++) {
                    System.out.println("Enter a pin");
                    String pin = s.nextLine();
                    app.openNewCard(pin);
                }

            }
        }
    }
}

