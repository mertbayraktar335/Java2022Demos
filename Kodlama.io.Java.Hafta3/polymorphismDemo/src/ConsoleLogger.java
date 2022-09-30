public class ConsoleLogger extends BaseLogger {
    public void log(String message){
        System.err.println("Logged to console : "+ message);
   }
}
