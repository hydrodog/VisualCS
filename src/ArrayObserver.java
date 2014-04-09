
/*
 * interface for all implementors of visualization of array manipulation
 * This is intended for sorting (modifying the array)
 * and searching (indexing into the array)
 * @author Dov Kruger
 */
public interface ArrayObserver {
	// two elements are swapped
	public void swap(int i, int j);
	
	// a block of elements from i to j are rotated to the right (positive) or left 
	public void rotate(int i, int j, int shift);

	// create a new observer at an index (think of visualizing with an arrow)
	public IteratorObserver observePosition(int i);
}
