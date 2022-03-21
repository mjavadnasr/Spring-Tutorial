package BeanLifeCycle;

public class TestClass {
    public void ShowMessage()
    {
        System.out.println("Hi From TestClass");
    }

    public void init()
    {
        System.out.println("Bean Created");
    }
    public void destroy(){
        System.out.println("Bean Destroyed");
    }
}
