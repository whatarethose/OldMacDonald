class Cow implements Animal 
{     
    protected String myType,mySound;
    public Cow(String type,String sound)
    {
    	myType=type;
    	mySound = sound;
    } //your code here
    public Cow()
    {
    	myType="Unknown";
    	mySound="Unknown";
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