public class Mammal {
    String respiratoryOrgan = "lung", food = "various kind food";
    boolean warmBlooded = true;
    int bodyTemperature;

    void breathe(){
        System.out.println("This animal breathes by using " + respiratoryOrgan);
    }

    void feedYoung(){
        System.out.println("Mammal feeds their young by producing milk and nursing them.");
    }

    void eat(String food){
        this.food = food;
        System.out.println("Mammal eat " + food + " as a survival instinct");
    }

    void temperature(){
        System.out.println(bodyTemperature != 0 ? ("Body temperature: " + bodyTemperature + " degrees celcius") : ("Body temperature: Not Available"));
    }

    void showInformation(){
        breathe();
        feedYoung();
        temperature();
        System.out.println("This animal is warm blooded: " + warmBlooded);
        eat(food);
    }
}
