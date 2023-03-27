public class Food {
    private String name;
    private int price;
    private String texture;

    public Food (String name, int price, String texture){
        this.name=name;
        this.price=price;
        this.texture=texture;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getTexture() {
        return texture;
    }

    public void buyFood(){
        System.out.println("This is so cheap!");
    }

    public void makeFood(){
        System.out.println("It's going to take how many hours?!?!?");
    }
}
