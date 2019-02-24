import java.util.Scanner;
//import Novice.Archer;

public class Running{
    private Scanner input;
    int addjob;
    int state;
    int addItem;
    private boolean run;
    private String name;
    private Novice novice;
       
    public Running(){
        run = true;
        input = new Scanner(System.in);
    }
    public void run(){
        System.out.print("\nPlease your charector name : ");
        novice = new Novice(input.nextLine());
        System.out.print("\n");
        System.out.println("Please your job");
        System.out.println("1 >>> Acolyte");
        System.out.println("2 >>> Archer");
        System.out.print("Prease enter : ");
        addjob = input.nextInt();
        if(addjob == 1){
            Acolyte acolyte = new Acolyte("Acolyte");
        }
        else if(addjob == 2){
            Archer archer = new Archer("Archer");
        }
        while(run){
            System.out.println("\nWhat do you want to do?");
            System.out.println("1 >>> Add Item");
            System.out.println("2 >>> Show Item");
            System.out.println("3 >>> Show info");
            System.out.println("0 >>> Exit");
            System.out.print("Prease enter : ");
            state = input.nextInt();
            System.out.print("\n");
            if(state == 1){
                System.out.println("List Item");
                System.out.println("1 >>> FrenchFries");
                System.out.println("2 >>> OrangeJuice");
                System.out.println("3 >>> RecipeBook");
                System.out.print("Prease enter : ");
                addItem = input.nextInt();
                if(addItem == 1){
                    novice.addItem("FrenchFries");
                }
                else if(addItem == 2){
                    novice.addItem("OrangeJuice");
                }
                else if(addItem == 3){
                    novice.addItem("RecipeBook");
                }
            }
            else if(state == 2){
                novice.showItems();
            }
            else if(state == 3){
                if(addjob == 1){
                    //Acolyte acolyte = new Acolyte(name);
                    novice.acolyteHP(0);
                    novice.allEXP(0);
                    novice.allMANA(0);
                    novice.showInfo();
                }
                else if(addjob == 2){
                    novice.archerHP(0);
                    novice.allEXP(0);
                    novice.allMANA(0);
                    novice.showInfo();
                }
            }
            else if(state == 0){
                run = false;
                System.out.println("Good luck, See you later.");
            }
        }
    }
}
       
    