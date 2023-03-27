public class Soup extends Food{
    private String name;
    private int price;
    private String texture;
    private String color;
    private Boolean creamy;

    public Soup(String name, int price, String texture,String color, Boolean creamy){
        super(name, price, texture);
        this.color=color;
        this.creamy=creamy;
    }

    public Boolean isCreamy(){
        return creamy;
    }

    public String getColor(){
        return color;
    }

    public void spill(){
        System.out.println("Hot! Hot!");
    }
}
