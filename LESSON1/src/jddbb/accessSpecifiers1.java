package jddbb;
//Class is having Default access modifier 
class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
  
  private void display_pvt() 
  { 
      System.out.println("You are using private access specifier"); 
  } 

} 

public class accessSpecifiers1 {

	public static void main(String[] args) {
		
		defAccessSpecifier obj = new defAccessSpecifier();
		//default
		System.out.println("Dafault Access Specifier");
        obj.display();
      //private
        System.out.println("Private Access Specifier");
      //trying to access private method of another class 
        //obj.display_pvt();
       

	}
}


