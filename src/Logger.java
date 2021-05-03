import java.util.ArrayList;

/**
 * This class implements a logger that is meant to be instantiated as a singleton.
 * A hypothetical use for it is keeping a record of the operations that a calculator
 * performs. No calculator has been created. The class just serves to illustrate how the
 * Singleton pattern would be implemented.
 *
 * @authour Ndabe Mahluza
 * @since 2021-05-03
 */

public class Logger {
    /** Logger object in which singleton instance will be stored */
    private static Logger logger;
    private ArrayList<String> log = new ArrayList<>();

    /**
     * Default constructor
     */
    public Logger(){}

    /**
     * Construct Singleton instance
     *
     * @return instance of Logger that will be Singleton
     * @throws RepeatException if Singleton already instantiated
     */
    public static Logger getInstance() throws RepeatException{
        // if Singleton already exists
        if (logger != null)
            throw new RepeatException("Already Instantiated");
        logger = new Logger();
        return logger;
    }

    /**
     * add operation to log
     *
     * @param s to be logged
     */
    public void log(String s) {
        log.add(s);
    }

    /**
     * Accessor method for log
     *
     * @return the log
     */
    public ArrayList<String> getLog() {
        return log;
    }

    /**
     * Print out log
     *
     * @return string representation of object
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ArrayList<String> newLog = getLog();

        for(String log: newLog) {
            builder.append(log);
            builder.append('\n');
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        // See code in operation
        Logger testLog1 = Logger.getInstance();
        testLog1.log("operation 1");
        testLog1.log("operation 2");
        System.out.println("Log:\n" + testLog1);
    }
}
