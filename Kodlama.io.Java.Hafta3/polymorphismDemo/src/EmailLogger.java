public class EmailLogger extends BaseLogger {
    public void log(String message){
        System.err.println("Logged to email : "+ message);
   }
}
