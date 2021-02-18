public class Lab06_3{
    public static void main(String[] args){
        Queue queue = new Queue();
        //Add 20 queue from 1...20
        for(int i=1;i<=20;i++){
            queue.enqueue(i);
        }
        //showing all the elements in the queue
        System.out.println("Before dequeue");
        for(int i=0;i<queue.getSize();i++){
            System.out.println(queue.getElements()[i]);
        }
        //dequeing the first 5 elements of the queue
        for(int i=0;i<5;i++){
            queue.dequeue();
        }
        //add one more queue just to test that you can add after you dequeue
        //showing all the left over element
        System.out.println("After dequeue");
        for(int i=0;i<queue.getSize();i++){
            System.out.println(queue.getElements()[i]);
        }
        //checking if the queue if empty
        System.out.println("Is the queue is empty? " + queue.isEmpty());

        //Testing stuff
        // int n = 8;
        // int[] arr = new int[n];
        // int i =0;
        // for(;i<8;i++){
        //     arr[i] = i;
        // }
        // n = n*2;
        // int[] temp = new int[n];
        // for(int j=0;j<n/2;j++){
        //     temp[j] = arr[j];
        // }
        // for(int j=0;j<n;j++){
        //     System.out.println(temp[j]);
        // }
        // arr = temp;
        // for(int j =0;j<n;j++){
        //     System.out.println(arr[j]);
        // }
    }
}