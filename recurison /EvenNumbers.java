public class EvenNumbers {
    static void main(String[] args) {
        even(0);
    }
    static void even(int n){
        if( n > 10) {
           return;
        }
        System.out.println(n);
        even(n + 2);

    }
}



