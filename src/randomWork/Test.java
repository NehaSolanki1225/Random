package randomWork;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Test
{
Test()
{
    System.out.println("Hi");
}

Test(String Name)
{
	this();
    System.out.println("Hello");
}

Test(int ID)
{
	this("good");
    System.out.println("Bye");
}

public static void main(String[] args) {
	Test t=new Test(23);
	
	
}
}
