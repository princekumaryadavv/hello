import java.util.Arrays;

public class Array  
{   
public static void main(String[] args)   
{   

int [] array = new int [] {920, 230, 55, 109, 12, 22, 67, 34};  
 
Arrays.sort(array);   
System.out.println("Elements of array sorted in ascending order: ");  

for (int i = 0; i < array.length; i++)   
{       
System.out.println(array[i]);   
}   
}  
}  
