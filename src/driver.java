//import classes

import animal.Puppy;
import utils.arrayUtils;
import utils.Math;


//get name

 public class Driver {	
 public static void main(String [] s){
	 
        Puppy Joey = new Puppy("Joey");
        Puppy Chandler = new Puppy("Chandler");
        Puppy Ross = new Puppy("Ross");
    
        System.out.println(Joey.getName());
        System.out.println(Chandler.getName());
        System.out.println(Ross.getName());
	}

 
//stringifyArray
 
int[] arr = {9, 20, 3, 44, 88, 300};
int[] Reverse = arrayUtils.reverse(arr);
System.out.println(arrayUtils.stringifyArray(Reverse))

//factorial

double n = 15.4;
System.out.println(Math.factorial((int) x));
System.out.println(Math.factorialLoop((int) x));
}
}	