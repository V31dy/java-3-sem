package ru.mirea.lab3;

public class MovableCirlcle{
    private int radius;
    private MovablePoint center;

    public MovableCirlcle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center.x = x;
        this.center.y = y;
        this.center.xSpeed = xSpeed;
        this.center.ySpeed = ySpeed;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCirlcle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
    public void movedDown(){
        this.center.y = this.center.y - this.center.ySpeed;
    }
    public void moveUp(){
        this.center.y = this.center.y + this.center.ySpeed;
    }
    public void moveLeft(){
        this.center.x = this.center.x - this.center.xSpeed;
    }
    public void moveRight(){
        this.center.x = this.center.x + this.center.xSpeed;
    }
}
