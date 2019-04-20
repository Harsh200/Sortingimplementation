public class MainSelectionSort {
    public static void main(String[] args) {
        System.out.println("enter the no of element");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        SelectionSort s=new SelectionSort(n);
        System.out.println("Enter the value of array");
        for (int i = 0; i < n; i++) {
            s.insert((scanner.nextLong()));

        }
        System.out.println("The value before sorting");
        s.display();
        s.sort();
        System.out.println("The value after Sorting");
        s.display();
    }
}
