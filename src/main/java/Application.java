import model.Kotik;

public class Application {

    public static void main(String[] args) {
        Kotik k1 = new Kotik(80,"Lana",2000,"meooow");
        k1.liveAnotherDay();
        System.out.println(k1.getNameCat()+" "+k1.getWeightCat());

        Kotik k2 = new Kotik();
        k2.setKotik(25,"Barsik",1500,"mmmyyyaaa");
        System.out.println(k2.getNameCat()+" "+k2.getWeightCat());

        if (k1.getMeow().equals(k2.getMeow()))
        {
            System.out.println("Kotiki myaukayut odinakovo");
        }
        else System.out.println("Kotiki myaukayut po raznomu");

        System.out.println("kol-vo kotikov = "+Kotik.getCount());
    }
}
