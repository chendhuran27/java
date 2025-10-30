public class differntage{
    public static void main(String args[]){
        int[] dude={11,23,2,3,4,34};
        int length=dude.length;
        int lowestage=dude[0];
        for(int age:dude){
            if(lowestage>age){
                lowestage =age;
            }
            
        }
        System.out.println("The lowest age value is :" +lowestage);
    }
}