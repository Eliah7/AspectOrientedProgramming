/*
* Standard Version of the AspectJ Library
**/

public aspect MannersAspect2 {
    pointcut callSayMessage() : call(public static void say*(..));

    before() : callSayMessage() {
        System.out.println("Good day!");
    }

    after() : callSayMessage() {
        System.out.println("Thank you!");
    }
}
