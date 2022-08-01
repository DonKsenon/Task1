import model.Kotik;

public class Application {

    public static void main(String[] args) {
        Kotik k1 = new Kotik((int)(Math.random()*100),NameCat.values()[(int)(Math.random()*NameCat.values().length)].toString(),(int)(1+Math.random()*10),MeowCat.values()[(int)(Math.random()*MeowCat.values().length)].toString());
        k1.liveAnotherDay();
        System.out.println(k1.getNameCat()+" "+k1.getWeightCat()+" "+k1.getMeow());

        Kotik k2 = new Kotik();
        k2.setKotik((int)(Math.random()*100),NameCat.values()[(int)(Math.random()*NameCat.values().length)].toString(),(int)(1+Math.random()*10),MeowCat.values()[(int)(Math.random()*MeowCat.values().length)].toString());
        System.out.println(k2.getNameCat()+" "+k2.getWeightCat()+" "+k2.getMeow());

        if (k1.getMeow().equals(k2.getMeow()))
        {
            System.out.println("Kotiki myaukayut odinakovo");
        }
        else System.out.println("Kotiki myaukayut po raznomu");

        System.out.println("kol-vo kotikov = "+Kotik.getCount());
    }
}
