import java.util.Locale;
import java.util.ResourceBundle;

public class Greeter {

  private Locale locale1;
  private String name;

  public Greeter(String language, String country, String name) {
    locale1 = new Locale(language, country);
    this.name = name;
  }

  public String sayHello() {
    ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale1);
    return messages.getString("greeting") + ", " + "_"+name+"_";
  }

  public static void main(String[] args) {
    String language = args[0];
    String country = args[1];
    String name = args[2];
    Greeter greeter = new Greeter(language, country, name);
    System.out.println(greeter.sayHello());
  }
}
