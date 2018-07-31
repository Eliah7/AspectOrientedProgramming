import org.aspectj.lang.annotation.*;

//Spring Version of the AspectJ
@Aspect
public class MannersAspect {

    @Before("execution(public static void say*(..))")
    public void beforePriting(){
        System.out.println("Good day");
    }

    @After("execution(public static void say*(..))")
    public void AfterPriting(){
        System.out.println("Good day");
    }


}
