package clinic.programming.training;
import java.util.ArrayList;
import java.util.List;


public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }
    public void greet()
    {
        List<String> greetings = new ArrayList<>();
        greetings.add("hello");
        for(String S:greetings)
        {
            System.out.println("greetings :"+S);
        }
    }
    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	    Application app = new Application();
        app.greet();
    }
}