package demo;
import java.util.Scanner;
public class demo {
  public static void main(String Args[]){
      JD[]jds=new JD[4];
      jds[0]=new lamp("灯",false);
      jds[1]=new tv("电视",false);
      jds[2]=new win("窗",false);
      jds[3]=new wash("洗刷",false);
      smarthomecontrol s=smarthomecontrol.getcontrol();
      while(true)
      {  s.printall(jds);
          System.out.println("请选择你要操作的家具:");
          Scanner sc=new Scanner(System.in);
          int command=sc.nextInt();
          switch(command)
          {
              case 1:
                  s.control(jds[0]);
                  break;
              case 2:
                  s.control(jds[1]);
                  break;
              case 3:
                  s.control(jds[2]);
                  break;
              case 4:
                  s.control(jds[3]);
                  break;
              case 0:
                  System.out.println("退出");
                  return;
              default:
                  System.out.println("格式错误");
                  break;
          }
      }


  }


}
