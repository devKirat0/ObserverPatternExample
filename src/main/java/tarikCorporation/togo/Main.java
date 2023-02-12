package tarikCorporation.togo;

public class Main {
    public static void main(String[] args) {
        //lets create an observable object
        SubscribeObserver subscribeObserver = new SubscribeObserver();

        //Object of ObserverImpl1
        ObserverImpl1 observerImpl1 = new ObserverImpl1();

        //Object of ObserverImpl2
        ObserverImpl2 observerImpl2 = new ObserverImpl2();

        //subscribe one of these object to the observable object
        subscribeObserver.addObserver(observerImpl1);
        //change Observable variable state
        subscribeObserver.setState(5);

        /*
            After running, you'll get the message : "The observable has changed!\nImplementation1 of observer is notified that the new value of state is : 5" because we only observerImpl1 is subscribed to the observable.
            If you want to subscribe the object of ObserverImpl2,you need to add : "subscribeObserver.addObserver(observerImpl2);" to your code.
            After that run your code again! what do you see ?
            The object of ObserverImpl2 is notified too but in different way.
            Now try to change the state again and run the code.
            you'll see that both are now notified but in different way.
            So if in your project you want for example some users to be notified when the product that they wanted is now available you can use Observer pattern to do it.
         */
    }
}