public class MovablePoitn implements Movable {
                   private int x;
                   private int y;
                   private int xSpeed;
                   private int ySpeed;
                   
                   public MovablePoitn(int x, int y, int xSpeed, int ySpeed){
                   this.x = x;
                   this.y = y;
                   this.xSpeed = xSpeed;
                   this.ySpeed = ySpeed;
                   }

                   
                   
                   public void moveUp(){
                   y += ySpeed;
                   };
                   public void moveDown(){
                   y -= ySpeed;
                   };
                   public void moveRight(){
                   x += xSpeed;
                   };
                   public void moveLeft(){
                   x -= xSpeed;
                   };  
                   public String toString(){
                   return "x: " + x + " y: " + y + " xSpeed: " + xSpeed + " ySpeed: " + ySpeed;
                   }
                   
}
