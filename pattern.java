public class pattern {
  public static void Hollow_rectangle(int n,int m){
  //outer loop
  for(int i=1; i<=n; i++){
  //inner loop
  for(int j=1; j<=m; j++){
  //cells (i,j)
  if (i==1 || i==n || j==1 || j==m) {
    //boundary cells
     System.out.print("*");
  }
  else{
    System.out.print(" ");     //empty space
  }
}
System.out.println();
  }
}
  public static void main(String args[]){
Hollow_rectangle(5, 5);
  }

}
