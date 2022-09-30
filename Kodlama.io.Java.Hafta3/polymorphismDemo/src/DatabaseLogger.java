public class DatabaseLogger extends BaseLogger {
    public void log(String message){
         System.err.println("Logged to database : "+ message);
    }
}
