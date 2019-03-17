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
        adjust(heap, 0, heapLength-1);
        return value;
    }

    static void heapSort(int[] heap, int n) {
        // for (int i = n-1; i >= 0; i--) {
        //     int temp = heap[i];
        //     heap[i] = heap[0];
        //     heap[0] = temp;

        //     adjust(heap, 0, i+1);
        //     for (int val : heap) {
        //         System.out.print(val + " ");
        //     }
        //     System.out.println();
        // }
    }

    static void adjust(int[] heap, int i, int heapLength) {
        int temp = heap[i];  //暫存heap[i]
        int j = 2*i;         //j的初值 = i的左子點
        
        while (j <= heapLength) {
            if (j < heapLength) {
                if (heap[j] < heap[j+1]) j = j+1; //此時的j為 max{左子點，右子點}
                if (temp >= heap[j]) break; //表示不用交換
                else {
                    heap[j/2] = heap[j]; //上移至父點
                    j = 2*j;
                }
            }
        }
        heap[j/2] = temp;
    }

    static void createHeap(int[] heap, int heapLength) {
        for (int j = heapLength/2-1; j >= 0; j--) {
            adjust(heap, j, heapLength);
        }
    }
}
