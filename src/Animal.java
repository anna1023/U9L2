public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;

    private boolean isClean;

    public Animal(String name,int age,boolean vaccinated,boolean isClean){
        this.name=name;
        this.age=age;
        this.vaccinated=vaccinated;
        this.isClean=isClean;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean isVaccinated(){
        return vaccinated;
    }

    public boolean isClean() {
        return isClean;
    }

    public void adopt(){
        System.out.println("You have been adopted!");
    }

    public void feed(){
        System.out.println("Nom");
    }

    public void sleep(){
        System.out.println("Good Night");
    }
}
