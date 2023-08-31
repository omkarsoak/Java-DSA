// We use < > to specify Parameter type
class student<T> 
{
	// An object of type T is declared
	T var1;
	public student(T var1) 
    {
        this.var1 = var1;
    }

    public T display() 
	{ 
		return this.var1; 
	}
	
}

class OOP8 {
	static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName()+ " = " + element);
    }
	public static void main(String[] args)
	{
		genericDisplay("omkar");
		genericDisplay(10);
	}
}