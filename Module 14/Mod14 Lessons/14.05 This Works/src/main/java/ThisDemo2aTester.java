class ThisDemo2a {

    private String name; // this name is an instance variable

    ThisDemo2a() {
    }

    public void setName(String name) // that name is a local variable
    {
        name = name;
    }

    public String getName() {
        return name;
    }
}

public class ThisDemo2aTester {

    public static void main(String[] args) {
        ThisDemo2a demo2a = new ThisDemo2a();
        demo2a.setName("Wilfred Diffie");
        System.out.println(demo2a.getName() + " is a famous cryptographer.");
    }
}
