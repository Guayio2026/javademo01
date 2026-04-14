package demo;

public class smarthomecontrol {
    private static final smarthomecontrol s=new smarthomecontrol();
    private smarthomecontrol()
    {}
    public static smarthomecontrol getcontrol()
    {
        return s;
    }
    public static void control(JD j)
    {
        System.out.print("当前家具为:    "+j.getName()+"状态为:  "+(j.isStatus()?"打开":"关闭"));
        j.press();
        System.out.print("操作后家具   状态为:     "+(j.isStatus()?"打开":"关闭"));

    }
    public static void printall(JD[]jds)
    {
        for(int i=0;i<jds.length;i++)
        {
            System.out.println("当前家具为: "+jds[i].getName()+"   状态为:  "+(jds[i].isStatus()?"打开":"关闭"));
        }
    }

}
