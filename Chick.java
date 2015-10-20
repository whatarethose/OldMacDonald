class Chick implements Animal 
{     
    private String mySound,myType,mySound2;
    public Chick(String type,String sound)
    {
    	mySound = sound;
    	myType=type;
    } //your code here
    public Chick(String type,String sound,String sound2)
    {
    	mySound = sound;
    	mySound2=sound2;
    	myType=type;
    }
    public Chick()
    {
    	mySound="Unknown";
    	myType="Unknown";
    	mySound2="Unknown";
    }
    public String getSound()
    {
    	int a = (int)(Math.random()*2);
    	if(a==0)
    	{
    		return mySound;
    	}
    	else
    	{
    		return mySound2;
    	}
    }
    public String getType()
    {
    	return myType;
    }
}