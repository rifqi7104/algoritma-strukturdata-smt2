package JOBSHEET2.Dragon;

public class Dragon21 {
    int x,y,width,height;

    void moveLeft(){
        x -= 1;
    }
    void moveRight(){
        x += 1;
    }
    void moveUp(){
        y +=1;
    }
    void moveDown(){
        y -=1;
    }
    void detectCollision(int x, int y){
        if ((x < 0 || x > width)||(y < 0 || y > height)) {
            System.out.println("GAME OVER!!");
            System.exit(0);
        }
    }
    void printPosition(){
        System.out.printf("Dragon Position : X = %d, Y= %d\n",x,y);
    }
    
}
