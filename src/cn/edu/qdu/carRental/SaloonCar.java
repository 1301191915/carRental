package cn.edu.qdu.carRental;

public abstract class SaloonCar extends Moto {
	public String name;
    public int price;
    public void Auto(String name,int price){
        this.name=name;
        this.price=price;
        
    }
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
    public void showInfo() {
        // TODO �Զ����ɵķ������
        System.out.println(getName() + '\t' +getPrice() +"Ԫ/��" + '\t' );
    }
}
