class Output
{
    public static void main(String[] args)
    {
        new M().product(3);
        new O().product(3);
        new P().product(3);
    }
}

class M
{
    int product(int i)
    {
        int result = i * i;
        return result;
    }
}

interface N
{
    int product(int i);
}

class O extends M implements N
{
    int product(int i)
    {
        int result = super.product(i) * i;
        
        System.out.println("In O class = " + super.product(i) * i);
        return result;
    }
}

class P extends M
{
    public int product(int i)
    {
        int result = super.product(i) + i;
        
        System.out.println("In P class = " + result);
        return result;
    }
}