public class HelloWorld {
    public static void say(String message){
        System.out.println(message);
    }

    public static void sayToPerson(String message, String name){
        System.out.println(name + ", " + message);
    }

    public static void main(String args[]){
        HelloWorld.say("Please pick up the package");
        HelloWorld.sayToPerson("Please pick up the package", "John");
    }
}
