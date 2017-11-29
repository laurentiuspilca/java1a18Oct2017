public class TooManyProductsException extends Exception {

    public TooManyProductsException() {
        super("There are too many products in this shop!");
    }
}