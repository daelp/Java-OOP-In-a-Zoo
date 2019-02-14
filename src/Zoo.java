public class Zoo {

    private String favoriteFood = "bacon";

    public static void main(String[]args){
        /*Zoo l = new Zoo();
        l.sleep("Tigger");
        l.eat("Tigger", "meat");
        l.eat("Tigger","bacon");
        */

        Tiger tigger  = new Tiger("tigger");
        tigger.eat("meat");
        tigger.eat("kibble");

        Bear pooh = new Bear("pooh");
        pooh.eat("fish");
        pooh.eat("meat");

        Unicorn rarity= new Unicorn("rarity");
        rarity.eat("marshmallows");
        rarity.eat("meat");

        Giraffe gemma = new Giraffe("gemma");
        gemma.eat("meat");
        gemma.eat("leaves");

        Bee stinger = new Bee("stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");

        Animal[] animals = {tigger,pooh,rarity,gemma,stinger};

        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals(animals,"meat");
    }

    public void sleep(String name){
        System.out.println(name + " sleeps for 8 hours");
    }
    public void eat(String name,String food){
        System.out.println(name + " eats " + food);

        if(food.equals(favoriteFood)){
            System.out.println("YUM!!! " + name + " wants more " + food);
        }else{
            sleep(name);
        }
    }
}