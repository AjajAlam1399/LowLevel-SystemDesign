package LoggingSystem.Utility;

public abstract class LogProcessor {
    public static  int INFO=1;
    public  static  int DEBUG=2;
    public  static  int ERROR=3;

    LogProcessor nextLoggProcessor;
    LogProcessor(LogProcessor nextLoggProcessor){
        this.nextLoggProcessor=nextLoggProcessor;
    }
    public  void log(int loglever,String message){
        if(nextLoggProcessor!=null){
            nextLoggProcessor.log(loglever,message);
        }
        else{
            System.out.println("Request can not be Resolved");
        }
    }
}
