class ThisDemo1c {

    private String name; // this name is an instance variable

    ThisDemo1c(String name) // that name is a local variable
    {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

public class ThisDemo1cTester {

    public static void main(String[] args) {
        ThisDemo1c demo1c = new ThisDemo1c("Wilfred Diffie");
        System.out.println(demo1c.getName() + " is a famous cryptographer.");
    }
}
