public class votes{
    public static void main(String[] args) {
        int age=18;
        boolean citizenvote=true;
        if(age<=20){
            System.out.println("old age enough to vote");
            if(citizenvote){
                System.out.println("yor a citizen you can also to vote ");
            }
            else{
                System.out.println("your are a citizen");
            }
        }
        else{
            System.out.println("your are under elgible to vote");
        }
    }
}