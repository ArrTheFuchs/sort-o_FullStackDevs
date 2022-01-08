import java.util.ArrayList;

public class Driver{
  public static void reverse( ArrayList arr ){
    
    for( int i = 0; i < arr.size()/2; i++){
      Sorts.swap(arr, i, arr.size()-1-i );
    }
    
  }

  public static void main (String[] args){
    //TO DO:
    //Add a way to check how "fast" it is
    
    ArrayList tbs = Sorts.populate(10, 0, 9);
    Sorts.bubble(tbs);

    //Bubble
    System.out.println("BUBBLE\n");
    System.out.println("Best Case:");
    Sorts.bubble(tbs);
  
    System.out.println("Worst Case:");
    Sorts.bubble(tbs);
    
    //Selection
    System.out.println("SELECTION");
    System.out.println("\nBest Case:");
    Sorts.selection(tbs);

    System.out.println("Worst Case:");
    reverse(tbs);
    Sorts.selection(tbs);
    
    //Insertion
    System.out.println("INSERTION");
    System.out.println("\nBest Case:");
    Sorts.insertion(tbs);

    System.out.println("Worst Case:");
    reverse(tbs); 
    Sorts.insertion(tbs);
  }
}
