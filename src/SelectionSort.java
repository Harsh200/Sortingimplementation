public class SelectionSort {
    private long[] array;
    private int numElements;

    public SelectionSort(int n){
        array=new long(n);
        numElements=0;
    }
    public void insert (long value){
        array[numElements]=value;
        numElements++;
    }
    public void display(){
        for (int i = 0; numElements < 10; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println(" ");
    }
    public void sort(){
        int i,j,min;
        for (int i = 0; i < numElements; i++) {
            min=i;
            for (int j = 0; j < numElements; j++) {
                if(array[j]<array[min]){
                    min=j;
                    swap(i,min);
                }
            }
        }
        private void swap(int one,int two){

        }
    }
}
