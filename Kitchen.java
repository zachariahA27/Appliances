class Kitchen{
    public static void main(String[] args) {
        Toaster t = new Toaster("Chromester");
        System.out.println(t.name + " has a darkness setting of" + t.getDarkness());
        t.toast();
        Toaster t2= new Toaster("Plastitoast");
        t2.setDarkness (890);
        t.setDarkness(-3);
        t2.isBagel=true;
        t2.toast();
        t.toast();
        AirFryer fryer= new AirFryer("Long John Silver");
        fryer.isBagel=true;
        fryer.toast();
        fryer.fry();
       
    }
}