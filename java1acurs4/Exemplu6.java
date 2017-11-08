public class Exemplu6 {

    public static void main(String [] args) {
        Zi zi = Zi.LUNI;
        
        switch(zi) {
            case LUNI:
                System.out.println(":(");
                break;
            case SAMBATA:
            case DUMINICA:
                System.out.println(":X");
                
        }
        
        for (Zi z : Zi.values()) {
            System.out.println(z.name() + " " + z.ordinal());
        }
    }
}