package examples.dynamic_array;
class DynamicArray 
{   
private int array[];   
private int count;   
private int sizeofarray;   
private int capacity;
//creating a constructor of the class that initializes the values  
public DynamicArray()   
{   
array = new int[1];   
count = 0;   
sizeofarray = 1;  
capacity =1;
}   
//creating a function that appends an element at the end of the array  
public void addElement(int a)   
{   
//compares if the number of elements is equal to the capacity of the array or not  
if (count == capacity)   
{   
//invoking the growSize() method that creates an array of double size      
growSize();   
}   
//appends an element at the end of the array   
array[count] = a;   
count++;  
sizeofarray++;
}   
//function that creates an array of double size  
public void growSize()   
{   
//declares a temp[] array      
int temp[] = null;   
if (count == capacity)   
{   
//initialize a double size array of array  
temp = new int[capacity * 2];   
{   
for (int i = 0; i < capacity; i++)   
{   
//copies all the elements of the old array  
temp[i] = array[i];   
}   
}   
}   
array = temp;   
capacity= capacity * 2;   
}   


//creating a function that removes the last elements for the array  
public void removeElement()   
{   
if (count > 0)   
{   
array[count - 1] = 0;   
count--; 
sizeofarray--;
}   
}   
//creating a function that deletes an element from the specified index  
public void removeElementAt(int index)   
{   
if (count > 0)   
{   
for (int i = index; i < count - 1; i++)   
{   
//shifting all the elements to the left from the specified index  
array[i] = array[i + 1];   
}   
array[count - 1] = 0;   
count--;   
sizeofarray--;
}   
}  
public int getSize() {
	return sizeofarray-1;
}
public int getAt(int i) {
	return array[i];
}
public void addArgs(int ...i) {
	for(int a : i) {
		addElement(a);
	}
}
public void print() {
	for (int i = 0; i < getSize(); i++)   
	{   
	System.out.print(getAt(i) + " ");   
	}   
}

}  



public class DynamicArrayDemo {
	public static void main(String[] args)   
	{   
	DynamicArray da = new DynamicArray();   
	//adding elements to the array  
	da.addElement(12);   
	da.addElement(22);   
	da.addElement(35);   
	da.addElement(47);   
	da.addElement(85);   
	da.addElement(26);   
	da.addElement(70);   
	da.addElement(81);   
	da.addElement(96);   
	da.addElement(54);  
	da.addArgs(1,2,3,4,5);
	System.out.println("Elements of the array:");   
	 
	da.print(); 
	System.out.println();   
	//determines and prints the size and number of elements of the array  
	System.out.println("Size of the array: " + da.getSize());   
	   
	//invoking the method to delete the last element of the array  
	da.removeElement();   
	//prints array after deleting the last element  
	System.out.print("\nElements of the array after deleting the last element: ");   
	da.print();
	System.out.println();   
	//determines and prints the size and number of elements of the array  
	System.out.println("Size of the array: " + da.getSize());   
	   
	//invoking the method that deletes an element from the specified index  
	da.removeElementAt(7);   
	System.out.print("\nElements of the array after deleting the element at index 7: ");   
	//prints the array after deleting the element from index 7  
     da.print();  
	System.out.println();   
	//determines and prints the size and number of elements of the array  
	System.out.println("Size of the array: " + da.getSize());   
	   
	}   
}
