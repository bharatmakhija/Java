# Adapter Pattern

Lets say we have two Interfaces ABC and XYZ as follows:

public Interface ABC{
public void Hello();
}

public Interface XYZ{
public void Greet();
}


public class MyABC implements ABC{

@Override
public void Hello(){  
System.out.println("Hello");  
};  
}  

- Above class implements ABC interface and has to implement methods on that Interface.



Say we want object of Class ABC to behave Like Class XYZ. i.e. 

- When we call Greet method of some object, Internally hello method should be called, for ex.
 
In such case we can create an adapter that will
basically create an object of XYZ in which ABC features will be wrapped. 

class abcToXyzAdapter implements XYZ{

}

Basically object of class abcToXyzAdapter is nothing but object of type XYZ. 
- This has to take ABC object as input.  

 
 class abcToXyzAdapter implements XYZ{
 
     ABC obj; // local ABC instance
 
    public abcToXyzAdapter(ABC obj){
        this.obj = obj;
    }
    
    @Override
    public void Greet{
    this.obj.Hello();
    }
 
 }
 
 - In the above adapter class we can pass any instance of classes that implement ABC Interface and the adapter class will make it behave like instace of XYZ Interface.
 
Class MyMain{

 public static void main(String[] args){  
 ABC temp = new MyABC();  
 abcToXyzAdapter x = new abcToXyzAdapter(temp);  
 x.Greet(); // This Greet will call hello of MyABC class.  
 }

}