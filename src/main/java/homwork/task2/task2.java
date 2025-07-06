package homwork.task2;

public class task2 {
        public static void main(String[] args) {
            TextProcessor tp = new TextProcessor("Катя", "Vargatiuk");
            tp.printFormats();// тепер з маленької
            tp.createEmail();

            System.out.println("Довжина повного імені: " + tp.getFullNameLength());


        }


}
