public class Telefon {
    String marca = "Nokia";//3
    static String banda = "GSM"; //1
    
    
    
    {//4
        marca = "Samsung";
        System.out.println("marca in init block: " + marca);
    }
    
    static { //2
        banda = "UMTS";
        System.out.println("banda in static init block: " + banda);
    }
    
    Telefon(String marca) {//5
        this.marca = marca;
        System.out.println("marca in constructor: " + this.marca);
    }
} 