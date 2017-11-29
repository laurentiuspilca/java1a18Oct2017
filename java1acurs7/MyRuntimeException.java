public class MyRuntimeException extends RuntimeException {

    public MyRuntimeException() {
        super("This is my unchecked (runtime) exception");
    }
}