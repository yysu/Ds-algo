// 用Bottom-up 建立 Max-Heap
// adjust() ： 調整以i為root之子樹成為Heap tree
// createHeap()
// deleteMax()
// heapsort()

public class HeapTest {
    public static void main(String[] args) {
        int[] heap = {1, 7, 4, 3, 2, 6, 8, 5};
        createHeap(heap, heap.length);
        for (int val : heap) {
            System.out.print(val + " ");
        }
        System.out.println();
        heapSort(heap, heap.length);
        for (int val : heap) {
            System.out.print(val + " ");
        }
    }

    static int deleteMax(int[] heap, int heapLength) {
        int value = heap[0];
        heap[0] = heap[heapLength-1];
        heapify(heap, 0, heapLength-1);
        return value;
    }

    static void heapSort(int[] heap, int n) {
        for (int i = n-1; i >= 0; i--) {
            int temp = heap[i];
            heap[i] = heap[0];
            heap[0] = temp;

            heapify(heap, 0, i);
        }
    }

    static void heapify(int[] arr, int i, int n) {
        int largest = i; // Initialize largest as root 
        int l = 2*i; // left = 2*i + 1 
        int r = 2*i+1; // right = 2*i + 2 
  
        // If left child is larger than root 
        if (l < n && arr[l] > arr[largest]) 
            largest = l; 
  
        // If right child is larger than largest so far 
        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
  
        // If largest is not root 
        if (largest != i) { 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
  
            // Recursively heapify the affected sub-tree 
            heapify(arr, largest, n); 
        } 
    }

    static void createHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(arr, i, n); 
    }
}
