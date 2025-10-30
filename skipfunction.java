public class skipfunction {
public static void main(String args[]){
    int[] numbers={1,2,3,5,4,23,-9,-3,-4,-5,3,0,3,4,6,5};
    int length=numbers.length;
    for(int n:numbers){
        if(n<0){
            continue;//this line skip negative integers
        }
        if(n==0){
            break;//this line n=0 stop the program
        }
        System.out.println(n);
    }
    
}
}
