import java.util.Scanner;

public class Safe implements Lockable {
    int inputCode;
    int correctCode = 451;

    public void enterCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите код");
        inputCode = scanner.nextInt();
    }

    @Override
    public void lock() {
        if (inputCode != correctCode) {
            System.out.println("В доступе отказано");
        }

        Lockable unlock = new Lockable() {
            @Override
            public void lock() {
                if (inputCode != correctCode) {
                    System.out.println("В доступе отказано");
                }
            }
            public void unlock(){
                if(inputCode == correctCode){
                    System.out.println("Добро пожаловать");
                }
            }
        };
    }
}
