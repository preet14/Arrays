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
  
  int max(){

    int max=0;
  
    for(int i=0;i<a.length;i++){

      if(a[i]>max){
       
       max = a[i];
 
      }
    }

    return max;
  
  }
  
}
class max{
  public static void main(String args[]){
    
  Scanner kb=new Scanner(System.in);
  
  System.out.println("Enter n:");

  int n = kb.nextInt();

  array a = new array(n);

  a.get();

  System.out.println("MAX:"+a.max());

  }
}