package homwork.task2;

    public class TextProcessor {

        public String firstName;
        public String lastName;


        public TextProcessor(String firstName, String lastName) {
            this.firstName = firstName.trim();
            this.lastName = lastName.trim();
        }


        public void printFormats() {
            System.out.println("Ім'я у верхньому регістрі: " + firstName.toUpperCase());
            System.out.println("Прізвище у верхньому регістрі: " + lastName.toUpperCase());
            System.out.println("Ім'я у нижньому регістрі: " + firstName.toLowerCase());
            System.out.println("Прізвище у нижньому регістрі: " + lastName.toLowerCase());

        }

        public void createEmail() {
            StringBuilder emailBuilder = new StringBuilder();
            emailBuilder.append(firstName.toLowerCase());
            emailBuilder.append(".");
            emailBuilder.append(lastName.toLowerCase());
            emailBuilder.append("@gmail.com");

            String email = emailBuilder.toString();
            System.out.println("Згенерований email: " + emailBuilder.toString());
        }

        public int getFullNameLength() {
            String fullName = firstName + " " + lastName;
            return fullName.length();
        }






}
