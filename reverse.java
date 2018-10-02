import java.util.Scanner;

class array{

  int a[];
   
  Scanner kb = new Scanner(System.in);

  array(int n){

   a = new int[n];
  
  }
  
  void get(){

    for(int i=0;i<a.length;i++){

    a[i] = kb.nextInt();

    }
    
  }
  
  void rev(){
    
    int t,j=a.length-1;
    
    for(int i=0;i<=a.length/2;i++,j--){
    
      t = a[i];
  
      a[i] = a[j];

      a[j] = t;  
 
    }
  
  }
  
  void print(){

    for(int i=0;i<a.length;i++){
    
      System.out.print(a[i]+" ");

    }
  
  }  

}
class reverse{
  
  public static void main(String args[]){
    
  Scanner kb=new Scanner(System.in);
  
  System.out.println("Enter n:");

  int n = kb.nextInt();

  array a = new array(n);

  a.get();

  a.rev();

  a.print();

  }

}