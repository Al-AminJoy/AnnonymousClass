package anonymousclass;

public class AnonymousClass {

    public static void main(String[] args) {
        Test test=new Test(){
          @Override
          void show(){
                      System.out.println("Anonymous Class");
          }  
        };
        test.show();
    }
    
}
