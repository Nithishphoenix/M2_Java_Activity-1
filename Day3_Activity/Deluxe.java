class Deluxe extends Hotelroom{

private int ratepersqfeet=10;
Deluxe()
{
}
Deluxe(int ratepersqfeet)
{
this.ratepersqfeet=10;
}

public void setRatepersqfeet(int sq)
{
this.ratepersqfeet=sq;
}
public int getRatepersqfeet()
{
return this.ratepersqfeet;
}

public  int display1(int a)
{

if(a==1)
{

a=ratepersqfeet+2;

return a;
}
else
{
a=ratepersqfeet;
return a;
}

}
}