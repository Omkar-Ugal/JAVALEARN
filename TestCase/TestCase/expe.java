package TestCase;
public class expe {
    public static void main(String[] args) {
        try{
            int res = 10 / 0;
            System.out.println(res);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("this block always execute");
        }
    }
}
