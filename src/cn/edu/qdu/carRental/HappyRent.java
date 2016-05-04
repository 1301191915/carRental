package cn.edu.qdu.carRental;

import java.util.Scanner;

public class HappyRent {
   public static void main(String[] args) {
	Moto[] allRent = {new SaloonCar("别克商务",600),new SaloonCar("宝马550i",500),new SaloonCar("别克林荫大道",300),new Bus("<=16座",800),new Bus(">16座",1500)};
	System.out.println("请使用开心租车系统");
    System.out.println("您是否想要租车：1是  0否");
    Scanner input= new Scanner(System.in);
    int choice = input.nextInt();
    while(choice!=0||choice !=1)
    {   //如果输入不为0或1，则重新输入
        if(choice ==0){
            System.out.println("感谢您使用嗒嗒租车系统，下次再见！");
            break;
        }else if(choice ==1){
            System.out.println("您可租车的类型及其价目表：");
            System.out.println("序号" + '\t' + "车型" + '\t' + "日租费" + '\t' );
            for(int i=0;i<allRent.length;i++){
                System.out.print((i+1) + ".\t");
                allRent[i].showInfo();
            }
            System.out.println("请输入想要租车的数量：");
            break;
        }else {
                System.out.println("请输入正确的数字：1是  0否");
                choice = input.nextInt();
            }
        }
    int carNum = input.nextInt();    //租车数量
    Moto[] choiceCar = new Moto[carNum];      //将客户选择的车辆对象放入choiceCar数组
    for(int i=0;i<carNum;i++){
        System.out.println("请输入第" + (i+1) +"辆车的序号:");
        int num =input.nextInt();//每辆车的序号
        choiceCar[i]=allRent[num-1];
    }
     
    System.out.println("请输入想要租车的天数：");
    int rentDay = input.nextInt();  //租车天数
     
     
//计算并显示账单
    System.out.println("********************您的账单信息如下：********************");
    int dayPrice=0;    //每天租车总价
     
     
    System.out.println(">>>>>>>您要租的车是：   ");
        for(int i=0;i<choiceCar.length;i++){
            dayPrice=choiceCar[i].getPrice()+dayPrice;

            choiceCar[i].showInfo();
        }
        //System.out.println("每天总价："+dayPrice);
    System.out.println(">>>>>>>您总共要租借：  " + rentDay  + "  天");
    int totalPrice = dayPrice*rentDay;   //总价
    System.out.println(">>>>>>>您总共需要支付：  " + totalPrice  + "  元");
    System.out.println("感谢您使用嗒嗒租车系统，下次再见！");
    input.close(); 
    
    
}
   
   
}
