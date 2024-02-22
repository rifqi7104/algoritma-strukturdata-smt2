package JOBSHEET2.Dragon;

public class DragonMain21 {
    public static void main(String[] args) {
        Dragon21 dg1 = new Dragon21();
        dg1.x = 3;
        dg1.y = 5;
        dg1.width = 10;
        dg1.height = 10;
    
        dg1.printPosition();
        dg1.moveRight();
        dg1.printPosition();
        dg1.detectCollision(dg1.x, dg1.y);    
        dg1.moveRight();
        dg1.printPosition();
        dg1.detectCollision(dg1.x, dg1.y);    
        dg1.moveRight();
        dg1.printPosition();
        dg1.detectCollision(dg1.x, dg1.y);    
        dg1.moveLeft();
        dg1.printPosition();
        dg1.detectCollision(dg1.x, dg1.y);    
        dg1.moveLeft();
        dg1.printPosition();
        dg1.detectCollision(dg1.x, dg1.y);    
        for (int i = 1; i <= 10;i++) {
            dg1.moveUp();
            dg1.printPosition();
            dg1.detectCollision(dg1.x, dg1.y);    
        }    
    }
}
