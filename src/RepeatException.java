/**
 * This class is an error that is thrown when someone attempts
 * to instantiate a Singleton more than once.
 */

public class RepeatException extends RuntimeException {
    RepeatException(String m) {super(m);}
}
