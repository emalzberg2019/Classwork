//1d array
int [] arr = new int[3]; // once you make it size of three, you cannot change its size
int [] arr1; //set to null
// so, if you did: arr[0] =1; you'd get a NULL EXCEPTION ERROR (its only referring to null.)
//arr1 = new int [4]; you can do this
arr1 = arr; //now its referring to arr
System.out.println(arr1);
System.out.println(arr1[0]);
arr1[1] = 1;
System.out.println(arr1.length);
//the above things are the only things you will have for 1d arrays (specifically the last
//four line)



//2d array
int[][] arr2 = new int [3][3]
int[][] arr3 = new int [4][2] //first number is number of rows, seconds number is number of
//columns.
arr4.length //this will give you the number of rows
arr4[0].length //this will give you the number of columns




