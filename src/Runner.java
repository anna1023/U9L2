public class Runner {
    public static void main(String[] args){
        Animal ani = new Animal("Sherry",2,true,true);
        System.out.println(ani.getName());
        System.out.println(ani.getAge());
        System.out.println(ani.isVaccinated());
        System.out.println(ani.isClean());
        ani.adopt();
        ani.feed();
        ani.sleep();

        Dog Cone = new Dog("Conan",10,true,true,false);
        System.out.println(Cone.getName());
        System.out.println(Cone.getAge());
        System.out.println(Cone.isVaccinated());
        System.out.println(Cone.isClean());
        System.out.println(Cone.getisBullDog());
        Cone.adopt();
        Cone.feed();
        Cone.fetch();
        Cone.walk();
        Cone.sleep();

        Cat cat = new Cat("Ren",10,true,false,5);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.isVaccinated());
        System.out.println(cat.isClean());
        System.out.println(cat.getCupsBroken());
        cat.adopt();
        cat.feed();
        cat.shed();
        cat.play();
        cat.sleep();
    }
}
