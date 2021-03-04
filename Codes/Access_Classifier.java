/* For understaing the codes check 
/Study_Theory_Materials/Access_modifier_Java_Working.png */


// Java program to illustrate default modifier  
package p1;  

class df_am  
{  
    void display()  
    {  
        System.out.println("Hello World");  
    }  
}

//Output 
//Hello World


// Java program to illustrate error while  
// using class from different package with  
// default modifier  
package p2;  
import p1.*;  

class df_am_n  
{  
    public static void main(String args[])  
    {  
        // Accessing class Geek from package p1  
        df_am obj = new df_am();  
  
        obj.display();  
    }  
}

//Output
//Compile time error



// Java program to illustrate error while  
// using class from different package with  
// private modifier  
package p1;  
  
class A  
{  
private void display()  
    {  
        System.out.println("Hello World");  
    }  
}  
  
class B  
{  
public static void main(String args[])  
    {  
        A obj = new A();  
        // Trying to access private method 
        // of another class  
        obj.display();  
    }  
}  

//Output ->
/* error: display() has private access in A
        obj.display(); */

// Java program to illustrate  
// protected modifier  
package p1;  
  
// Class A  
public class A  
{  
protected void display()  
    {  
        System.out.println("Hello World");  
    }  
}  

// Java program to illustrate  
// protected modifier  
package p2;  
import p1.*; // importing all classes in package p1  
  
// Class B is subclass of A  
class B extends A  
{  
public static void main(String args[])  
{  
    B obj = new B();  
    obj.display();  
}  
      
}  

//Output
//Hello World


// Java program to illustrate  
// public modifier  
package p1;  
public class A  
{  
public void display()  
    {  
        System.out.println("Hello World");  
    }  
}  
package p2;  
import p1.*;  
class B  
{  
    public static void main(String args[])  
    {  
        A obj = new A;  
        obj.display();  
    }  
} 

//Output
//Hello World