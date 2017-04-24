class ThisDemo1b
{    
    private String myName;    //this name is an instance variable

    ThisDemo1b(String name)   //this name is a local variable     
    {
        myName = name;
    }

    public String getName()
    {
        return myName;
    }
}
public class ThisDemo1bTester
{
    public static void main(String[] args)
    {
        ThisDemo1b demo1b = new ThisDemo1b("Wilfred Diffie");
        System.out.println(demo1b.getName() + " is a famous cryptographer.");
    }
}
