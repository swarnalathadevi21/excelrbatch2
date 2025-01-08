public class DEMO008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String loginid;
        String pwd;
        String reply;
        do {
            System.out.println("Welcome to Malla Reddy university");
            System.out.println("have you visited our site earlier");
            reply = sc.nextLine();
            if(reply == "no") {
                System.out.println("logIn here");
                System.out.println("enter your id and pwd");
                loginId = sc.nextLine();
                pwd = sc.nextLine();
            }else
            System.out.println("you are our valued customer");
        }while (loginid == "Swarna") && (pwd == "12345");
    }
}

