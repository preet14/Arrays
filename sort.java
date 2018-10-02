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
  
  void sort(){
    
    int t;
    
    for(int i=1;i<a.length;i++){
   
      for(int j=0;j<a.length-1;j++){

        if(a[j+1] < a[j]){

          t = a[j+1];
          
          a[j+1] = a[j];

          a[j] = t;

        } 
      
      } 
    
    }
  
  }
  
  void print(){

    for(int i=0;i<a.length;i++){
    
      System.out.print(a[i]+" ");

    }
  
  }  

}
class sort{
  
  public static void main(String args[]){
    
  Scanner kb=new Scanner(System.in);
  
  System.out.println("Enter n:");

  int n = kb.nextInt();

  array a = new array(n);

  a.get();

  a.sort();

  a.print();

  }

}