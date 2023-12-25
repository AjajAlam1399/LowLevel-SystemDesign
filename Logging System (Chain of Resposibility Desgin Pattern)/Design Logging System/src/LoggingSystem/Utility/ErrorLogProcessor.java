package LoggingSystem.Utility;

public class ErrorLogProcessor extends  LogProcessor{
    public ErrorLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }
    public void log(int loglevel,String message){
        if(loglevel==ERROR){
            System.out.println("ERROR: "+message);
        }
        else{
            super.log(loglevel,message);
        }
    }
}
