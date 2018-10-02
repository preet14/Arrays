import java.util.Scanner;

class array2{
  
  int a[][];

  Scanner kb = new Scanner(System.in);

  array2(int n,int m){

    a = new int[n][m];

  }
  
  void get(){

    for(int i=0;i<a.length;i++){

      for(int j=0;j<a[i].length;j++){

        a[i][j] = kb.nextInt();

      }

    }

  }
  
  void print(){

    for(int i=0;i<a.length;i++){
     
      if((i+1)%2 != 0){     

        for(int j=0;j<a[i].length;j++){

          System.out.print(a[i][j]+" ");        
    
        }

      }

      else{

        for(int j=a[i].length-1;j>=0;j--){

          System.out.print(a[i][j]+" ");        
    
        }
  
      }

    }
  
  }

}

class wave{

  public static void main(String args[]){

    int n,m;

    Scanner kb = new Scanner(System.in);
 
    System.out.println("Enter rows and columns:");

    n = kb.nextInt();

    m = kb.nextInt();

    array2 a = new array2(n,m);

    a.get();

    a.print();
  
  }
}