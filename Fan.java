public class Fan
{
   int SLOW = 1;
   int MEDIUM = 2;
   int FAST = 3;
   private int speed;
   private boolean on;
   private double radius;
   String color;
   
   Fan()
   {
      speed = SLOW;
      on = false;
      radius = 5;
      color = "blue";
   }
   void setSpeed(int speed)
   {
      this.speed = speed;
   }
   void setOn(boolean on)
   {
      this.on  = on;
   }
   void setRadius(double radius)
   {
      this.radius = radius;
   }
   void setColor(String color)
   {
      this.color = color;
   }
   int getSpeed()
   {
      return speed;
   }
   boolean getOn()
   {
      return on;
   }
   double getRadius()
   {
      return radius;
   }
   String getColor()
   {
      return color;
   }
   public String toString()
   {
      if (getOn())
         return "Fan speed: " + getSpeed() + "\nColor: " + getColor() + "\nRadius: " + getRadius();
      else
         return "Fan is off" + " \nColor: " + getColor() + "\nRadius: " + getRadius();
   }
}