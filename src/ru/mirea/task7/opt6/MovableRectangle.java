package ru.mirea.task7.opt6;
import ru.mirea.task7.opt5.Movable;
import ru.mirea.task7.opt5.MovablePoint;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint topRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        topRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    @Override
    public void moveUp() {
        topRight.moveUp();
        topLeft.moveUp();
    }

    public void moveDown() {
        topRight.moveDown();
        topLeft.moveDown();
    }

    public void moveRight() {
        topRight.moveRight();
        topLeft.moveRight();
    }

    public void moveLeft() {
        topRight.moveLeft();
        topLeft.moveLeft();
    }

    public void checkSpeed(){
        if(topLeft.xSpeed == topRight.xSpeed&&topLeft.ySpeed == topRight.ySpeed)
            System.out.println("Speed is ok");
        else System.out.println("Speed of points is different");
    }
}
