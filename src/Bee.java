public class Bee extends Animal {
    //Constructor
    public Bee(String name) {
        super(name, "pollen");
    }

    //Methods
    public void sleep(String name){
        System.out.println(name + " never sleeps");
    }

    public void eat(String food){
        if(food == favoriteFood){
            System.out.println("YUM!!! " + this.name + " wants more " + favoriteFood);
            sleep(name);
        }else{
            System.out.println("YUCK!!! " + this.name + " will not eat" + food);
            System.out.println(this.name + " eats " + favoriteFood);
        }
    }
}
