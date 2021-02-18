public class Queue{
    private int[] elements;
    private int size;
    static int index = 0;

    //Constructors
    Queue(){
        this.elements = new int[8];
        this.size = 8;
    }
    Queue(int size){
        this.elements = new int[size];
        this.size = size;
    }

    //Accessors
    public int[] getElements(){
        return this.elements;
    }
    public int getSize(){
        return this.size;
    }

    //Functions
    public void enqueue(int v){
        if(this.index >= this.size - 1){
            this.size = this.size * 2;
            int[] temp = new int[this.size];
            for(int i=0;i<this.size / 2;i++){
                temp[i] = this.elements[i];
            }
            this.elements = temp;
        }
        this.elements[this.index] = v;
        this.index++;
    }
    public int dequeue(){
        this.index--;
        for(int i=0;i<this.size-1;i++){
            this.elements[i] = this.elements[i+1];
        }
        return this.elements[0];
    }
    public Boolean isEmpty(){
        int count = 0;
        for(int i=0;i<this.size;i++){
            if(this.elements[i] == 0){
                count++;
            }
        }
        if(count == this.size){
            return true;
        }
        return false;
    }
}