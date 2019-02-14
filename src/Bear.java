public class Bear extends Animal {

    //Constructor
    public Bear(String name) {
        super(name,"fish");
    }
    //Methods
    public void sleep(String name){
        System.out.println(name + " hibernates for 4 months");
    }

    public void eat(String food){
        System.out.println(this.name + " eats " + food);

        if(food == favoriteFood){
            System.out.println("YUM!!! " + this.name + " wants more " + this.favoriteFood);
        }else{
            sleep(name);
        }
    }
}
