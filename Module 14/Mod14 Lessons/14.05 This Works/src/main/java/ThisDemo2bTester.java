class ThisDemo2b
{    
    private String myName;            //this name is an instance variable

    public void setName(String name)  //that name is a local variable    
    {
      myName = name;
    }

    public String getName()
    {
        return myName;
    }
}
public class ThisDemo2bTester
{
    public static void main(String[] args)
    {
        ThisDemo2b demo2b = new ThisDemo2b();
        demo2b.setName("Willfred Diffie");
        System.out.println(demo2b.getName() + " is a famous cryptographer.");
    }
}
