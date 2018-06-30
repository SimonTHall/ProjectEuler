package practice.euler;

class Robot {
    private int currentX = 0;
    private int currentY = 5;
    private int previousX = 0;
    private int previousY = 5;
    
    private boolean xWasMovedLast = false;
    
    public Robot(){}
    
    public Robot(int currentX, int currentY){
        this.currentX = currentX;
        this.currentY = currentY;
    }
    
    public void moveX(int dx){
        previousX = currentX;
        currentX = currentX + dx;
        xWasMovedLast = true;
    }
    
    public void moveY(int dy){
        previousY = currentY;
        currentY = currentY + dy;
        xWasMovedLast = false;
        //System.out.println("Last:" + previousX + " " + previousY);
    }
    
    public void printCurrentCoordinates(){
        String currentCoordinates = currentX + " " + currentY;
        System.out.println(currentCoordinates);
    }
    public void printLastCoordinates(){
        String currentCoordinates = xWasMovedLast ? previousX + " " + currentY : currentX + " " + previousY ;
        System.out.println(currentCoordinates);
    }
    public void printLastMove(){
        System.out.println(xWasMovedLast ? "x " + (currentX-previousX) : "y " + (currentY-previousY));
    }
}