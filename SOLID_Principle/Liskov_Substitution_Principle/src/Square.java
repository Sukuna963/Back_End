public class Square extends Shape {
    private int sideValue;
    
    public Square(int sideValue) {
        if(sideValue <= 0) {
            throw new IllegalArgumentException();
        }
        
        this.sideValue = sideValue;
    }
    
    @Override
    public int calculateArea() {
        return sideValue * sideValue;
    }
    
    public int getSideValue() {
        return sideValue;
    }
    
    public void setSideValue(int sideValue){
        this.sideValue = sideValue;
    }
}