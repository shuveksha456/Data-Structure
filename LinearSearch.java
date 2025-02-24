public class LinearSearch {
        static int linearSearch(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) { // Loop through the array
                if (arr[i] == target) { // Check if the current element matches the target
                    return i; // Return index if found
                }                                     
            }
            return -1; // Return -1 if the target is not found
        }
    
        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50}; // Sample array
            int target = 30; // Element to search
    
            int result = linearSearch(arr, target); // Call the search function
    
            if (result != -1)
                System.out.println("Element found at index " + result);
            else
                System.out.println("Element not found");
        }
    }
    

