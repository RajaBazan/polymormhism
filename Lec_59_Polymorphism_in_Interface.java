package hello.com;
interface MyCamera2{
    void takeSnaps();
    void RecordVideo();
}
interface MyWifi2{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void CallNumber(long PhoneNumber){
        System.out.println("Calling: " + PhoneNumber);
    }
    void PickCall(){
        System.out.println("Connecting..");
    }

}
class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{
    public void takeSnaps(){
        System.out.println("Taking snap");
    }

    @Override
    public void RecordVideo() {
        System.out.println("Recording a video");
    }
    public String[] getNetwork() {
        String[] networkList = {"Bazan", "Ali", "Ahmed"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to" + network);
    }}
public class Lec_59_Polymorphism_in_Interface {
    public static void main(String[] args) {
        MyCamera2 obj = new MySmartPhone2();
        obj.RecordVideo();
        obj.takeSnaps();
        MySmartPhone2 s = new MySmartPhone2();
        s.getNetwork();
        String [] ar = s.getNetwork();
        for (String item:ar) {
            System.out.println(item);
        }
        s.RecordVideo();
        s.PickCall();
    }
}
