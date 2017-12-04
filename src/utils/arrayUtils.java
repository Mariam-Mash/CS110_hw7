//reverse array

package utils;
public class arrayUtils{
public static int[] reverse (int[] array) {
	int[] arr = new int[array.length];
	for(int i=0; i<array.length; i++) {
		arr[i] = array[array.length-1 - i];
	}
	return arr;
	}


//stringifyArray

public static String stringifyArray(int[] arr) {
	String result = "";
	for(int i = 0; i < arr.length; i++) {
		if(i == arr.length-1) {
			result = result + arr[i];
			break;
		}
		result = result + arr[i] + ", ";
	}
	return result;
}
}
