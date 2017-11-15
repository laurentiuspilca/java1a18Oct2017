public class Exemplu7 {

    public static void main() {
    
        Masina m1 = new Masina();
        Masina.Motor motor = m1.new Motor();
        
        motor.ruleaza();
        System.out.println(m1.x);
        
        motor.ruleaza();
        System.out.println(m1.x);
        
        motor.ruleaza();
        System.out.println(m1.x);
    }
}