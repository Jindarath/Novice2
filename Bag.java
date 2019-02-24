import java.util.ArrayList;

public class Bag{
    private ArrayList<Item> items;
    private int limit;

    public Bag(){
        this.items = new ArrayList<Item> ();
        limit = 10;
    }
    public void addItem(String name){
        if(name.equals("FrenchFries")){
            this.items.add(new FrenchFries(name));
        }
        else if(name.equals("OrangeJuice")){
            this.items.add(new OrangeJuice(name));
        }
        else if(name.equals("RecipeBook")){
            this.items.add(new RecipeBook(name));
        }
    }
    public void showItem(){
        System.out.println("------------------");
        for(int i=0; i<items.size(); i++){
            items.get(i).show();
        }
        System.out.println("------------------");
    }
    
    
}