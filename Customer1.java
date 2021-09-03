class Customer1
{
int id;
String name;
public Customer1()
{
	System.out.println("defalult constructor");
}
public Customer1(int id,String name)
{
this();
this.id=id;
this.name=name;
}
public int getId()
{
return id;
}
public String getName()
{
return name;
}
}
