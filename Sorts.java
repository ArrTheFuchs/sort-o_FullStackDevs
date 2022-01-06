import java.util.ArrayList;

public class Sorts{
  //HELPER METHODS

// returns an ArrayList of random integers from lo to hi, inclusive
public static ArrayList populate( int size, int lo, int hi ) {
  ArrayList<Integer> retAL = new ArrayList<Integer>();
  while( size > 0 ) {
    //     offset + rand int on interval [lo,hi]
    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
    size--;
  }
  return retAL;
}

//randomly rearrange elements of an ArrayList
public static void shuffle( ArrayList al )
{
  int randomIndex;
  //setup for traversal fr right to left
  for( int i = al.size()-1; i > 0; i-- ) {
    //pick an index at random
    randomIndex = (int)( (i+1) * Math.random() );
    //swap the values at position i and randomIndex
    al.set( i, al.set( randomIndex, al.get(i) ) );
  }
}

//swaps items in the 2 indexes and returns the new ArrayList
public static void swap(ArrayList swapee, int i1, int i2){
  Object temp = swapee.get(i1);
  swapee.set(i1, swapee.get(i2) );
  swapee.set(i2, temp);
}

// VOID version of bubbleSort
// Rearranges elements of input ArrayList
// postcondition: data's elements sorted in ascending order
public static void bubble( ArrayList<Comparable> data )
{
  //for each pass do this
  //we loop size of array - 1 times
  for( int i = 0; i < data.size()-1; i++){
    //for each comparison do this
    //we loop less and less for each pass
    for( int x = data.size()-1; x > i; x--){
      Comparable left = data.get(x-1);
      Comparable right = data.get(x);
      //check right is greater than or = to left
      if( right.compareTo(left) >= 0 ){
        continue;
      }
      //swap
      swap(data, x, x-1);
    }
  }
}

public static void selection(ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;

    for(int pass = data.size() - 1; pass >= 0; pass--) {
      System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
      maxPos = 0;
      for(int i = 0; i <= pass; i++) {
        System.out.println( "maxPos: " + maxPos );//diag
        System.out.println( data );//diag
        if (data.get(i).compareTo(data.get(maxPos)) > 0) {
          maxPos = i;
        }
      }
      swap(data, pass, maxPos);

      System.out.println( "after swap: " +  data );//diag
    }
  }//end selectionSort

  // VOID version of InsertionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void insertion( ArrayList<Comparable> data )
  {
    for(int partition = 0; partition < data.size() - 1; partition++) {
      //partition marks first item in unsorted region

      System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      System.out.println( data );

      //traverse sorted region from right to left
      for(int i = partition + 1; i > 0; i--) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if ( data.get(i).compareTo(data.get(i - 1)) < 0 ) {

          System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
          swap(data, i, i - 1);

        }
        else
          break;
      }
    }
  }//end insertionSort

}//end of class
