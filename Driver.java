import java.util.ArrayList;

public class Driver{
  public static void reverse( ArrayList arr ){
    
    for( int i = 0; i < arr.size()/2; i++){
      Sorts.swap(arr, i, arr.size()-1-i );
    }
    
  }

  public static void testThree( int size ){
    ArrayList tbs = Sorts.populate(size, 0, 100);
    Sorts.bubble(tbs);

    //Bubble
    System.out.println("BUBBLE\n");
    System.out.println("Best Case");
    System.out.println( Sorts.bubble(tbs) );
  
    System.out.println("Worst Case");
    reverse(tbs);
    System.out.println( Sorts.bubble(tbs) );
    
    //Selection
    System.out.println("SELECTION");
    System.out.println("\nBest Case");
    System.out.println( Sorts.selection(tbs) );

    System.out.println("Worst Case");
    reverse(tbs);
    System.out.println( Sorts.selection(tbs) ); 
    
    //Insertion
    System.out.println("INSERTION");
    System.out.println("\nBest Case");
    System.out.println( Sorts.insertion(tbs) );

    System.out.println("Worst Case");
    reverse(tbs);
    System.out.println( Sorts.insertion(tbs) );

  }

  public static void main (String[] args){

    for( int i = 10; i <= 40; i *= 2 ){

      System.out.println("Test for ArrayList of size " + i + "\n");
      testThree(i);

    }
  }
}
