public class Mypoint {
                   private int x= 0;
                   private int y = 0;
                   public Mypoint(){};
                   public Mypoint(int x,int y){
                                      this.x=x;
                                      this.y=y;
                   }
                   public int getX()
                   {
                                      return x;
                   }
                   public void setX(int x){
                                      this.x=x;
                   }
                   public int getY()
                   {
                                      return y;
                   }
                   public void setY(int y)
                   {
                                      this.y=y;
                   }
                   public void setXY(int x,int y)
                   {
                                      this.x=x;
                                      this.y=y;
                   }
                   public String toString()
                   {
                                      return "("+x+","+y+")";
                   }
                   public double distance(int x, int y )
                   {
                                      return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
                   }
                   public double distance(Mypoint another)
                   {
                                      return Math.sqrt((this.x-another.x)*(this.x-another.x)+(this.y-another.y)*(this.y-another.y));
                   }

                   
}
