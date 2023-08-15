public class Main {
    public static void main(String[] args) {

        StockObservable observable = new IphoneStockObservable();

        Observer observer1= new EmailNotifyObserver("abc@gmail.com");
        Observer observer2 = new MobileNotifyObserver("atsam1");
        Observer observer3 = new EmailNotifyObserver("rsam@gmail.com");

        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);

        observable.getCurrentStock();
        observable.updateStock(10);
        observable.getCurrentStock();
        observable.updateStock(0);
        observable.useStock(10);
        observable.getCurrentStock();
        observable.updateStock(14);


    }
}