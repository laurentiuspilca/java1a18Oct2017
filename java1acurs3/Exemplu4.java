public class Exemplu4 {
    public static void main(String [] args) {
        //Masina m1 = new Masina();
        
        
        
        //m1.marca = "Volvo"; marca este final
        //m1.anFabricatie = 2001; anFabricatie este final
        //m1.culoare = "rosu";
        //System.out.println(m1.marca + " " + m1.anFabricatie);
        
        Masina m2 = new Masina("Dacia", 2010, "alb");
        Masina m3 = new Masina("Audi", 2015, "albastru");
        
        //m2.marca = "Volvo"; marca este final
        System.out.println(Masina.NR_ROTI);
        //Masina.NR_ROTI = 3;
    }
}