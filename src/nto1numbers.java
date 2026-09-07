import org.w3c.dom.ls.LSOutput;

public class nto1numbers {
    static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        if(n == 0) {
            return;
        }
        System.out.println(n);
        print(n-1);
    }

}
