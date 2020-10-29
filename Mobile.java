class ParametizedCon
{
 int storage;
 String osversion;
int battery_mah;
Float camera_pixel;
 ParametizedCon(int storage,String osversion,int battery_mah, Float camera_pixel)
{
  this.storage=storage;
  this.osversion= osversion;
 this.battery_mah=battery_mah;
 this.camera_pixel=camera_pixel;
this.display();
}

 void display()
{
System.out.println("  mobile storage="+storage);
System.out.println(" mobile osversion="+osversion);
System.out.println(" mobile battery ="+battery_mah);
System.out.println(" mobile camera ="+camera_pixel);

}
}
class Mobile
{

  public static void main(String args[])
{
Mobile  M  = new Mobile(64,"Android",502 ,48.0f);


}
}
