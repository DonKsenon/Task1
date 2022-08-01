package model;

public class Kotik {

    int prettiness;
    String meow;
    private int satiety = 10;
    private String[] action = new String[]{"play", "sleep", "meow", "eat", "chaseMouse"};
    static int count;
    int weightCat;
    String nameCat;

    public String getMeow() {
        return meow;
    }

    public Kotik() {
        count++;
    }

    public Kotik(int prettiness, String name, int weight, String meow) {
        setKotik(prettiness, name, weight, meow);
        count++;
    }

    public void setKotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.nameCat = name;
        this.weightCat = weight;
        this.meow = meow;
    }

    public String getNameCat() {
        return nameCat;
    }

    public int getWeightCat() {
        return weightCat;
    }

    public static int getCount() {
        return count;
    }

    public void liveAnotherDay() {
        int randomAction;
        int hangry;
        for (int i = 0; i < 24; i++) {
            randomAction = (int) (Math.random() * 3 + 1);
            hangry = (int) (Math.random() * 5 + 5);
            switch (action[randomAction]) {
                case "play": {
                    if (play()) {
                        satiety -= hangry;
                    } else eat();
                    System.out.println(" satiety=" + satiety);
                    break;
                }
                case "sleep": {
                    if (sleep()) {
                        satiety -= hangry;
                    } else eat();
                    System.out.println(" satiety=" + satiety);
                    break;
                }
                case "meow": {
                    if (meow()) {
                        satiety -= hangry;
                    } else eat();
                    System.out.println(" satiety=" + satiety);
                    break;
                }
                case "eat": {
                    eat();
                    System.out.println(" satiety=" + satiety);
                    break;
                }
                case "chaseMouse": {
                    if (chaseMouse()) {
                        satiety -= hangry;
                    } else eat();
                    System.out.println(" satiety=" + satiety);
                    break;
                }
                default:
                    System.out.println("Dannie ne naideni");
            }
        }
    }

    private boolean checkSatiety() {
        if (satiety > 0) {
            return true;
        } else return false;
    }

    private boolean play() {
        if (checkSatiety()) {
            System.out.printf("Kotik plaing ");
            return true;
        } else {
            System.out.printf("Kotik hangry, dont plaing, please feed ");
            return false;
        }

    }

    private boolean sleep() {
        if (checkSatiety()) {
            System.out.printf("Kotik sleeping ");
            return true;
        } else {
            System.out.printf("Kotik hangry, dont sleeping, please feed ");
            return false;
        }
    }

    private boolean chaseMouse() {
        if (checkSatiety()) {
            System.out.printf("Kotik chase Mouse ");
            return true;
        } else {
            System.out.printf("Kotik hangry, dont chase Mouse, please feed ");
            return false;
        }
    }

    private boolean meow() {
        if (checkSatiety()) {
            System.out.printf("Kotik meow ");
            return true;
        } else {
            System.out.printf("Kotik hangry, dont moew, please feed ");
            return false;
        }
    }

    private boolean eat() {
        int energiya =randomEnergii();
        String food = randomFood();
        if (satiety < 20) {
            eat(energiya,food);
            System.out.printf("Kotik poel "+food+" i poluchil "+energiya+" energii");
            return true;
        } else {
            System.out.printf("Kotik ne goloden");
            satiety -= 2;
            return false;
        }
    }

    private boolean eat(int sit) {
        satiety += sit;
        return true;
    }

    private boolean eat(int sit, String nameFood) {
        eat(sit);
        return true;
    }

    private int randomEnergii()
    {
        return (int) (Math.random()*20+1);
    }

    private String randomFood()
    {
        return FoodCat.values()[(int)(Math.random()*FoodCat.values().length)].toString();
    }

}
