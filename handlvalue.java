public class handlvalue {
    public static void main(String args[]){
        int[]number={100,93,85,10};
        int max=number[0];
        int min=number[0];
        for(int n:number){
            if(max<n){
                max=n;
            }
            if(min>n){
                min=n;
            }
           
        }
            System.out.println("max value is:" +max);
            System.out.println("min value is:" +min);
    }
}
