package cn.edu.qdu.carRental;

public abstract class Moto {
	public  String name;     //车名
    public int price;     //价格
     
    public abstract void showInfo(); //抽象方法，子类继承时重写，显示车名、价格、载客或载货量
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getPrice() {
        return price;
    }
 
    public void setPrice(int price) {
        this.price = price;
    }
}
