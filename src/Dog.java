public class Dog extends Animal{
    private String name;
    private int age;
    private boolean vaccinated;
    private boolean isClean;
    private boolean isBullDog;
    private boolean hasBeenWalked=false;

    public Dog(String name, int age, boolean vaccinated, boolean isClean,boolean isBullDog) {
        super(name, age, vaccinated, isClean);
        this.isBullDog=isBullDog;
    }

    public void walk(){
        System.out.println("Time for a walk!");
        hasBeenWalked=true;
    }

    public boolean gethasBeenWalked(){
        return hasBeenWalked;
    }

    public void fetch(){
        System.out.println("Go fetch!");
    }

    public boolean getisBullDog(){
        return isBullDog;
    }


}
