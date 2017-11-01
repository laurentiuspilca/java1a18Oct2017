public class Punct {
    int x;
    int y;
    
    
    
    Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    double calculeazaDistanta(Punct p) {
        return Math.sqrt( (this.x - p.x) * (this.x - p.x) +
                          (this.y - p.y) * (this.y - p.y));
    }
    
    static double calculeazaDistantaStatic(Punct p1, Punct p2) {
        return Math.sqrt( (p1.x - p2.x) * (p1.x - p2.x) +
                          (p1.y - p2.y) * (p1.y - p2.y));
    }
    
    
    
    
    
    
    
    
}