interface Square 
{
  void getArea(int length, int breadth);
}

class Rectangle implements  Square
 {
  public void getArea(int length, int breadth)
 {
    System.out.println("The area of the rectangle =" + (length * breadth));
  }
}

class InterfSquare
 {
  public static void main(String args[])
 {
    Rectangle  box = new Rectangle();
    box.getArea(10,20);
  }
}