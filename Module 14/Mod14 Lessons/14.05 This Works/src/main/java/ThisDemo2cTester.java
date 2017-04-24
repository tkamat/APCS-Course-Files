class ThisDemo2c
{    
    private String name;            //this name is an instance variable

    public void setName(String name)  //that name is a local variable    
    {
      this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
}
public class ThisDemo2cTester
{
    public static void main(String[] args)
    {
        ThisDemo2c demo2c = new ThisDemo2c();
        demo2c.setName("Willfred Diffie");
        System.out.println(demo2c.getName() + " is a famous cryptographer.");
    }
}

