import java.io.Console;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Console yourBox = System.console();
    System.out.println("Welcome to PingPong, a Java based implementation of FizzBuzz");
    System.out.println("Choose a whole number more then 1:");
    int yourNumber = Integer.parseInt(yourBox.readLine());
    PingPong newPingPong = new PingPong();
    List<Object> pingPongResult = newPingPong.runPingPong(yourNumber);
    System.out.println(pingPongResult);
  }
}
