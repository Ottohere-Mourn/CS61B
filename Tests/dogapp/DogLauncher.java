package Tests.dogapp;
public class DogLauncher {
    public static void main(String[] args){
        Dog chester = new Dog(17);
        Dog yusuf = new Dog(150);

        Dog larger=Dog.maxDog(chester,yusuf);
        larger.makeNoise();
    }
}
