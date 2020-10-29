class Chrome
{
void Apps()
{
 System.out.println("1.Gmail 2.Facebook 3.YouTube 4.Google Drive");
}
 void openGoogle()
{
 System.out.println(" Click on the Apps in the Google page");
}
 String ClickFacebook()
{
 return "kanakaDurga";
}
void Search(String data)
{
   System.out.println("entered data in youTube ="+ data);
 }
}
 class Google
{
 public static void main(String args[])
{
 Chrome Google =new  Chrome();
  Google.Apps();
  Google.openGoogle();
 
 System.out.println("Click on the Facebook ="+  Google.ClickFacebook());
 Google.Search("how to apply PAN card ");
 }
}


