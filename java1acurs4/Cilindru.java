public final class Cilindru extends Cerc {

    double h;
    
    @Override
    public final double getArie() {
        return 2 * 3.14 * raza * raza + 2 * 3.14 * raza * h;
    }
}