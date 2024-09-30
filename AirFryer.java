public class AirFryer extends Toaster {
    public AirFryer(String name){
        super(name);
    }
    public void fry(){
        
        for(int x = 0; x<=12; x++){
            System.out.println(x);
            
        }
        
        System.out.println(slices);
        System.out.println("YUM-- It is Fried. ");
        
        
    }
    @Override public void toast(){
      super.toast();
      System.out.println("Are you sure you wanted toast? Fry is better");
    }
}
