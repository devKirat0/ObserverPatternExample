package tarikCorporation.togo;

public class ObserverImpl1 implements Observer{
    @Override
    public void update(Observable observable) {
        int state = ((SubscribeObserver) observable).getState();
        System.out.printf("The observable has changed!\n Implementation1 of observer is notified that the new value of state is : %d%n", state);
    }
}
