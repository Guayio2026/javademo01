package demo;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
public class demo {
  public static void main(String Args[]){
      JFrame win= new JFrame("家具管理系统");
      win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      win.setSize(500,500);
      win.setLocationRelativeTo(null);
      win.setVisible(true);
      JPanel panel=new JPanel();
      win.add(panel);
      JButton btn=new JButton("登录");
      panel.add(btn);
      btn.addActionListener(new ActionListener(){

          @Override
          public void actionPerformed(ActionEvent e){
              System.out.println("登录成功");
          }
      });//
      JD[]jds=new JD[4];
      jds[0]=new lamp("灯",false,1);
      jds[1]=new tv("电视",false,2);
      jds[2]=new wind("窗",false,3);
      jds[3]=new wash("洗刷",false,4);
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
