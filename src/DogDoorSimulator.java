public class DogDoorSimulator {

    public static void main(String[] args) {
        DogDoor door =new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Fido barks to go outside....");
        remote.pressButton();
        System.out.println("\n Fido has gone outside...");
        System.out.println("\n Fido's all done");

        try {
            Thread.currentThread().sleep(10000);
        }
        catch (InterruptedException e) {}

        System.out.println("... but he stuck outside");
        System.out.println("\n Fido start barking....");
        System.out.println("\n so Gina grab the remote control");
        remote.pressButton();
        System.out.println("\n Fido back inside");

    }
}
