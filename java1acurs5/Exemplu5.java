public class Exemplu5 {

    public static void main(String [] args) {
        Personaj p1 = new HarryPotter();
        
        Personaj p2 = new Dracula();
        
        Vampir v1 = new Dracula();
        Monstruos m1 = new Dracula();
        
        if (m1 instanceof Dracula) {
            System.out.println("Bau!");
        }
    }
}