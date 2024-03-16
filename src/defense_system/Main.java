package defense_system;

public class Main {
    public static void main(String[] args) {
        Observable observable = Observable.getInstance();

        Main_Controller_Form mainController = new Main_Controller_Form();
        Helicopter_Form helicopter = new Helicopter_Form();
        War_Tank_Form tank = new War_Tank_Form();
        Submarine_Form submarine = new Submarine_Form();

        mainController.setVisible(true);
        helicopter.setVisible(true);
        tank.setVisible(true);
        submarine.setVisible(true);

        observable.addComponent(mainController);
        observable.addComponent(helicopter);
        observable.addComponent(tank);
        observable.addComponent(submarine);
    }
}