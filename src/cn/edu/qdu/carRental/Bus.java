package cn.edu.qdu.carRental;

public abstract class Bus extends Moto {
	public String capPerson; //�ؿ���
	public int price;
	public Bus(int price,String capPerson){
        this.price=price;
        this.capPerson=capPerson;
    }
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setCapPerson(String capPerson) {
		this.capPerson = capPerson;
	}
	
	public String getCapPerson() {
		return capPerson;
	}
	
	public void showInfo() {
        // TODO �Զ����ɵķ������
        System.out.println(getCapPerson() + '\t' +getPrice() +"Ԫ/��" +'\t');
    }
}
