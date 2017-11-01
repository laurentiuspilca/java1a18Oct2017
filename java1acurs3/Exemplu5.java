public class Exemplu5 {
    public static void main(String [] args) {
        Animal a = new Animal("iepure");
        
        
        
        a.seHraneste();
        a.seHraneste("morcovi");
        a.seHraneste(true);
        a.seHraneste("varza", 200);
        a.seHraneste(2, "morcovi");
    }
}