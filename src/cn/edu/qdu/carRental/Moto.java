package cn.edu.qdu.carRental;

public abstract class Moto {
	public  String name;     //����
    public int price;     //�۸�
     
    public abstract void showInfo(); //���󷽷�������̳�ʱ��д����ʾ�������۸��ؿͻ��ػ���
 
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
