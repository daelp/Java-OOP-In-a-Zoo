public class Giraffe extends  Animal{

    //Constructor
    public Giraffe(String name) {
        super(name,"leaves");
    }
    //Methods

    public void eat(String food){

        if(food == favoriteFood){
            super.eat(food);
            sleep(name);
        }else{
            System.out.println("YUCK!!! " + this.name + " will not eat " + food);
        }
    }
}
