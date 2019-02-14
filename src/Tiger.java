public class  Tiger extends Animal{

    //Constructor
    public Tiger(String name) {
        super(name,"meat");
    }
    //Methods

    public void sleep(String name){
        System.out.println(this.name + " sleeps for 8 hours");
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