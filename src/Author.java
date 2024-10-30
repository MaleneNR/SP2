import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles;

    public Author(String name){
        this.name = name;
        titles = new ArrayList<Title>();
    }

    public void addTitle(Title t){
        titles.add(t);
    }

    public float calculateTotalPay(){
        float totalPay = 0;
        for (Title t: titles){
            totalPay += (float) t.calculateRoyalty();
        }
        return totalPay;
    }

    @Override
    public String toString(){
        String s = name + " : " + String.format("%.2f",calculateTotalPay()) + "kr";
        return s;
    }
}
