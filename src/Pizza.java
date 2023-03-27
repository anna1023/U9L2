public class Pizza extends Food{
    private String name;
    private int price;
    private String texture;
    private String shape;
    private String topping; //

    public Pizza(String name, int price, String texture, String shape,String topping){
        super(name, price, texture);
        this.shape=shape;
        this.topping=topping;
    }

    public String getShape(){
        return shape;
    }

    public String getTopping() {
        return topping;
    }

    public void handToss(){
        System.out.println("Up you go!");
    }
}
