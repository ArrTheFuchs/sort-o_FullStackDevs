dddimport java.util.ArrayList;

public class Driver{
  public static void reverse( ArrayList arr ){
    
    for( int i = 0; i < arr.size()/2; i++){
      Sorts.swap(arr, i, arr.size()-1-i );
    }
    
  }

  public static void main (String[] args){
    //ArrayList to be uses for testing
    ArrayList tbs = Sorts.populate(10, 0, 9);

    //To have it sorted initiall (doesnt matter what sort we use)
    Sorts.bubble(tbs);

    //Bubble
    System.out.println("BUBBLE\n");
    System.out.println("Best Case:");
    System.out.println( Sorts.bubble(tbs) );
  
    System.out.println("Worst Case:");
    reverse(tbs);
    System.out.println( Sorts.bubble(tbs) );
    
    //Selection
    System.out.println("SELECTION");
    System.out.println("\nBest Case:");
    System.out.println( Sorts.selection(tbs) );

    System.out.println("Worst Case:");
    reverse(tbs);
    System.out.println( Sorts.selection(tbs) ); 
    
    //Insertion
    System.out.println("INSERTION");
    System.out.println("\nBest Case:");
    System.out.println( Sorts.insertion(tbs) );

    System.out.println("Worst Case:");
    reverse(tbs);
    System.out.println( Sorts.insertion(tbs) );
  }
}
