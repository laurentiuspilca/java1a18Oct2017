public class Door implements AutoCloseable {
    
    private String nume;
    
    public Door(String nume) {
        this.nume = nume;
    }

    @Override
    public void close() {
        System.out.println("Closing the door " + nume);
        throw new RuntimeException("Exceptie door " + nume);
    }

}