import LoggingSystem.Utility.DebugLogProcessor;
import LoggingSystem.Utility.ErrorLogProcessor;
import LoggingSystem.Utility.InfoLogProcessor;
import LoggingSystem.Utility.LogProcessor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LogProcessor logobj=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logobj.log(LogProcessor.ERROR,"Exception happend");
        logobj.log(LogProcessor.DEBUG,"need to debug this");
        logobj.log(LogProcessor.INFO,"just for info");
    }
}