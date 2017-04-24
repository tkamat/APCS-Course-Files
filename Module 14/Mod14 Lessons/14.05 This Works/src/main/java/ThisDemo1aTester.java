class ThisDemo1a {

    private String name; // this name is an instance variable

    ThisDemo1a(String name) // that name is a local variable
    {
        name = name;
    }

    public String getName() {
        return name;
    }
}

public class ThisDemo1aTester {

    public static void main(String[] args) {
        ThisDemo1a demo1a = new ThisDemo1a("Wilfred Diffie");
        System.out.println(demo1a.getName() + " is a famous cryptographer.");
    }
}
