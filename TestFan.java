public class TestFan
{
   public static void main (String[] args)
   {
      Fan f1 = new Fan();
      f1.setSpeed(2);
      f1.setOn(true);
      System.out.println("On? " + f1.getOn());
      f1.setRadius(7);
      System.out.println("Fan radius: " + f1.getRadius() + "\n");
      f1.setColor("red");
      System.out.println(f1.toString() + "\n");
      
      Fan f2 = new Fan();
      f2.setSpeed(1);
      System.out.println("Fan speed: " + f2.getSpeed());
      f2.setOn(true);
      f2.setRadius(6);
      f2.setColor("turquoise");
      System.out.println("Color: " + f2.getColor() + "\n");
      System.out.println(f2.toString() + "\n");
      f2.setOn(false);
      System.out.println(f2.toString());
   }
}