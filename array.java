// //input/output in array
// import java.util.*;
// public class array {
//   public static void main(String[] args) {
//     // int marks[]=new int[100];
//     System.out.print("Enter the size of the array:");
//    Scanner sc = new Scanner(System.in);
//     // marks[0]=sc.nextInt();
//     // marks[0]=sc.nextInt();

//     int size = sc.nextInt();
    
//     int arr[] = new int[size];
    
//   }
  
// }



import java.util.*;
public class array
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of size:");
    // Size of the array
    int size = sc.nextInt();
    // define array
    int number[] = new int[size];
    // input
    System.out.println("Enter the array elements:");
    for(int i=0;i<size;i++)
      {
        number[i] = sc.nextInt();
      }
    System.out.print("Choose the elements for find out:");
    int x = sc.nextInt();

    // output
    
    for(int i=0;i<size;i++)
      {
        if(number[i]==x)
        {
          System.out.println(x +" found at the index:"+i);
        }
       
      }
  }
}
