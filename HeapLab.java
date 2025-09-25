import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Scanner;

public class HeapLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of incidents: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        
        int[] ids = new int[n];
        String[] locations = new String[n];
        int[] severities = new int[n];
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int i = 0; i < n; i++) {
            ids[i] = 101 + i;
            System.out.print(ids[i] + " - Enter location: ");
            locations[i] = sc.nextLine();
            System.out.print(ids[i] + " - Enter severity (1 - 10): ");
            severities[i] = sc.nextInt();
            sc.nextLine(); 
            
            
            maxHeap.add(severities[i]);
            minHeap.add(severities[i]);
        }
        
        
        System.out.println("\nDispatch Order (Max - Heap)");
        while (!maxHeap.isEmpty()) {
            int sev = maxHeap.poll();
            for (int i = 0; i < n; i++) {
                if (severities[i] == sev) {
                    System.out.println(ids[i] + " - " + locations[i] + " (Severity: " + sev + ")");
                    break;
                }
            }
        }
        
       
        System.out.println("Backlog Monitoring (Min - Heap)");
        while (!minHeap.isEmpty()) {
            int sev = minHeap.poll();
            for (int i = 0; i < n; i++) {
                if (severities[i] == sev) {
                    System.out.println(ids[i] + " - " + locations[i] + " (Severity: " + sev + ")");
                    break;
                }
            }
        }
        
        sc.close();
    }
}
