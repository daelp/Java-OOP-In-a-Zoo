public class Animal {
    public String name;
    public String favoriteFood;

    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        population++;
    }

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
    static int population;
}
