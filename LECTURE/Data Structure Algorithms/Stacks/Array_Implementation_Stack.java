public class Array_Implementation_Stack {
    public static class Stack{
        private int array[] = new int[5];
        private int index = 0;
        void push(int x){
            array[index] = x;
            index++;
        }
        int peek(){
            if (index == 0) {
                System.out.println("Stack is empty ! ");
                return -1;
            }
            return array[index-1];
        }
        int pop(){
            if(index == 0){
                System.out.println("Stack is empty ! ");
                return -1;
            }
            int top = array[index-1];
            array[index-1]=0;
            index--;
            return top;
        }
        void display(){
            for(int i = 0; i<= index-1; i++){
                System.out.println(array[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return index;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.display();
    }
}
