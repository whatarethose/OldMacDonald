class Pig implements Animal 
{     
     private String mySound,myType;//your code here
     public Pig(String type,String sound)
     {
     	mySound=sound;
     	myType=type;
     }
     public Pig()
     {
     	mySound="Unknown";
     	myType="Unknown";
     }
     public String getSound()
     {
     	return mySound;
     }
     public String getType()
     {
     	return myType;
     }
}