# Never Fear, Big O is Here!

TNPG: 
ROSTER: Perry Huang, Salaj Rijal, Ariel Fuchs

All the sorting methods

SONG OF THE WEEK: ------ -- x0o0x_

**Work in progress... not sure if correct yet** <br>

## Bubble Sort

### **Best Case:** Already Sorted <br>
**Why:** If it's already sorted, then bubble will not have to make any swaps, going over the array just once, and it will be the most efficient. <br>
**Complexity:** $O(n)$

### **Worst Case:** Backwards Sorted <br>
**Why:** If it's backwards sorted, bubble will have to swap every single index multiple times, leading to the least efficient way.<br>
**Complexity:** $O(n^2)$

## Selection Sort

### **Best Case:** Doest Matter <br>
**Why:** Selection swaps things with itself anyways, so it doesn't matter, because even if it was sorted there would still be swaps.<br>
**Complexity:** $O(n^2)$

### **Worst Case:** Doesnt Matter <br>
**Why:** According to the logic above there is also no worst case.<br>
**Complexity:** $O(n^2)$

## Insertion Sort

### **Best Case:** Already Sorted <br>
**Why:** Insertion won't have to swap anything if the array is already sorted.<br>
**Complexity:** $O(n)$

### **Worst Case:** Backwards Sorted <br>
**Why:** Insertion will have to swap every time the array length is increased.<br>
**Complexity:** $O(n^2)$