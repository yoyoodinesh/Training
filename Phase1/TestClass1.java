public class TestClass1 implements First, Second 
{  
    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        TestClass1 ob = new TestClass1(); 
        ob.show(); 
    } 
}

