public class Main {
    public static void main(String[] args) {
        Lockable lockHouse = () -> System.out.println("House is lock");
        Lockable lockSafe = () -> System.out.println("Safe is lock");
        Lockable lockComputer = () -> System.out.println("Computer is lock");

        lockHouse.lock();
        lockSafe.lock();
        lockComputer.lock();
    }
}