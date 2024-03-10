import javax.swing.*;

public class Main {
    public static void main(String[] args) {

      //  new Submarine_Form().setVisible(true);
        new Helicopter_Form().setVisible(true);
       /* new WarTank_Form().setVisible(true);
        new Main_Controller_Form().setVisible(true);*/

        Observeble observeble = Observeble.getinstace();

        Helicopter_Form heli = new Helicopter_Form();

       // Observeble.addComp(heli);
    }
}