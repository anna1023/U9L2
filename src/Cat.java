public class Cat extends Animal{
    private String name;
    private int age;
    private boolean vaccinated;
    private int cupsBroken;
    private boolean hasPlayedWith=false;

    public Cat(String name, int age, boolean vaccinated,boolean isClean, int cupsBroken){
        super(name, age, vaccinated, isClean);
        this.cupsBroken=cupsBroken;
    }

    public void play(){
        System.out.println("Meow Meow");
        hasPlayedWith=true;
    }

    public boolean isHasPlayedWith(){
        return hasPlayedWith;
    }

    public int getCupsBroken(){
        return cupsBroken;
    }

    public void shed(){
        System.out.println("There's cat hair in my sandwich!");
    }
}
