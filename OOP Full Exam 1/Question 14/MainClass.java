enum Enums
{
    ONE("ONE"), TWO("TWO"), THREE("THREE");

    String s = "NAME";

    private Enums(String s)
    {
        this.s = s;
    }

    void method()
    {
        System.out.println(s);
    }
}

public class MainClass
{
    public static void main(String[] args)
    {
        Enums.ONE.method();
        Enums.TWO.method();
        Enums.THREE.method();
    }
}