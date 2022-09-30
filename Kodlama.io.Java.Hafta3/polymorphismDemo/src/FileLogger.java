public class FileLogger extends BaseLogger {
    public void log(String message){
        System.err.println("Logged to file : "+ message);
   }
}
