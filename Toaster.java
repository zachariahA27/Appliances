public class Toaster {
    String name;
    int slices;
    private int darknessSetting;
    boolean isBagel = false;
    static int totalSlicesToasted=0;
    public Toaster(String name){
        this.name=name;
        this.darknessSetting=5;
        this.slices=2;
    }
    public int getDarkness(){
        return darknessSetting;
    }
    public void setDarkness(int newSetting){
        if (newSetting<1){
            newSetting=1;
        }
        if (newSetting>10){
            newSetting=10;

        }
        darknessSetting=newSetting;
    }
    public void toast(){
        totalSlicesToasted += slices;
        System.out.println("--------------------");
        System.out.println(name+ " is working...");
        int n=0;
        while(n<=darknessSetting){
            System.out.println(n);
            n++;
        }
        if(isBagel){
            System.out.println("It's a toasted bagel!");
        }
        else{
            System.out.println("Is Toast!");
            System.out.println("Total slices " + totalSlicesToasted);
        }
    }
}
