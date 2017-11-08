public enum Coffee {

    SMALL, MEDIUM(50), BIG(100);
    
    
    int quantity;
    
    Coffee() {
    }
    
    Coffee(int quantity) {
        this.quantity = quantity;
    }
    
    public void drinkCoffee() {
        quantity--;
    }
    
    public void fillCoffee() {
        quantity++;
    }
}