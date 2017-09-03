package hashcode;
//package defines a name space in which classes are stored
import hashcode.Word;
//import is used to make classes and interfaces available and accessible to the current 
//source code
public class Hashcode {
	//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
	//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class

	public static void main(String[] args)
	//public keyword is an access modifier
	//static allows main() to be called without having to instantiate a particular instance of the class
	//void simply says the compiler that main() does not return a value
{
		// TODO Auto-generated method stub
		Word w1=new Word();//intializing the value to the word
		Word w2=new Word();
		System.out.println("Hash code="+w1.hashCode());//printing the hash code value 
		//of the given variables
		System.out.println("Hash code="+w2.hashCode());
		
	}

}
