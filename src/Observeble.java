public class Observeble {

    private Observer[] ob = new Observer[0];

    private static Observeble instance = null;
    private String name;
    private String massage;

    private Observeble(){}

    public void addComp(Observer comp){
        System.out.println("add");
        extendArray();
        ob[ob.length-1]=comp;
    }

    private void extendArray(){
        Observer[] temp = new Observer[ob.length+1];
        for (int i = 0; i < ob.length; i++) {
            System.out.println(i);
            temp[i]=ob[i];
        }
        ob=temp;
    }

    public void getMassage(String massage,String name){
        this.name=name;
        this.massage=massage;
        System.out.println("Controller :> "+name+" : "+massage);
        notifyMassage();
    }
    public void notifyMassage(){

        for (int i = 0; i < ob.length; i++) {
            System.out.println(i);
            ob[i].sendData(this.massage,this.name);
        }
    }

    public static Observeble getinstace(){
        if(instance==null){
            instance=new Observeble();
        }
        return instance;
    }
}
