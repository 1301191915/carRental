package cn.edu.qdu.carRental;

import java.util.Scanner;

public class HappyRent {
   public static void main(String[] args) {
	Moto[] allRent = {new SaloonCar("�������",600),new SaloonCar("����550i",500),new SaloonCar("���������",300),new Bus("<=16��",800),new Bus(">16��",1500)};
	System.out.println("��ʹ�ÿ����⳵ϵͳ");
    System.out.println("���Ƿ���Ҫ�⳵��1��  0��");
    Scanner input= new Scanner(System.in);
    int choice = input.nextInt();
    while(choice!=0||choice !=1)
    {   //������벻Ϊ0��1������������
        if(choice ==0){
            System.out.println("��л��ʹ�����⳵ϵͳ���´��ټ���");
            break;
        }else if(choice ==1){
            System.out.println("�����⳵�����ͼ����Ŀ��");
            System.out.println("���" + '\t' + "����" + '\t' + "�����" + '\t' );
            for(int i=0;i<allRent.length;i++){
                System.out.print((i+1) + ".\t");
                allRent[i].showInfo();
            }
            System.out.println("��������Ҫ�⳵��������");
            break;
        }else {
                System.out.println("��������ȷ�����֣�1��  0��");
                choice = input.nextInt();
            }
        }
    int carNum = input.nextInt();    //�⳵����
    Moto[] choiceCar = new Moto[carNum];      //���ͻ�ѡ��ĳ����������choiceCar����
    for(int i=0;i<carNum;i++){
        System.out.println("�������" + (i+1) +"���������:");
        int num =input.nextInt();//ÿ���������
        choiceCar[i]=allRent[num-1];
    }
     
    System.out.println("��������Ҫ�⳵��������");
    int rentDay = input.nextInt();  //�⳵����
     
     
//���㲢��ʾ�˵�
    System.out.println("********************�����˵���Ϣ���£�********************");
    int dayPrice=0;    //ÿ���⳵�ܼ�
     
     
    System.out.println(">>>>>>>��Ҫ��ĳ��ǣ�   ");
        for(int i=0;i<choiceCar.length;i++){
            dayPrice=choiceCar[i].getPrice()+dayPrice;

            choiceCar[i].showInfo();
        }
        //System.out.println("ÿ���ܼۣ�"+dayPrice);
    System.out.println(">>>>>>>���ܹ�Ҫ��裺  " + rentDay  + "  ��");
    int totalPrice = dayPrice*rentDay;   //�ܼ�
    System.out.println(">>>>>>>���ܹ���Ҫ֧����  " + totalPrice  + "  Ԫ");
    System.out.println("��л��ʹ�����⳵ϵͳ���´��ټ���");
    input.close(); 
    
    
}
   
   
}
