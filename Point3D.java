//Point3D.java
//R.Scott McLeod
//Date 10/4/2017
//Point 3d class file representing 3-dimensional points at coordinates (x,y,z).

public class Point3D{
   //Field declarations
   private int x, y, z;
   
   //Constructor
   public Point3D(int x, int y, int z){
     this.x = x;
     this.y = y;
     this.z = z;
   }
   
   public int getX(){
      return this.x;
   }
   
   public int getY(){
      return this.y;
   }   
   
   public int getZ(){
      return this.z;
   }
   
   public void setX(int x){
      this.x = x;
      
   }
   
   public void setY(int y){
      this.y = y;
   }
   
   public void setZ(int z){
      this.z = z;
   } 
   
   public void setCoords(int x,int y,int z){
      this.x = x;
      this.y = y;
      this.z = z;
   } 
   
   public boolean equals(Point3D p2){
   
   return((this.x == p2.getX()) && (this.y == p2.getY()) && (this.z == p2.getZ()));
   
   }   
   
   public String toString(){
      
      return (x + ", " + y + ", " + z);
   }
 
   
    public static void main(String[] args)
    {       
        // create various Point3D objects

        Point3D p1 = new Point3D(1, 2, 3);
        Point3D p2 = new Point3D(2, 3, 4);
        
        // Test the methods of Point3D
        System.out.println("p1 toString = " + p1.toString());
        System.out.println("p2 accessors = " +
                p2.getX() + "," + p2.getY() + "," + p2.getZ()); 
        p1.setCoords(10, 20, 30);
        System.out.println("p1 setCoords = " + p1.toString());
        p2.setX(50);
        p2.setY(60);
        p2.setZ(70);
        System.out.println("p2 toString = " + p2.toString());
        System.out.println("equals for p1 and p2 = " +
                            p1.equals(p2));
    }      

}//end class