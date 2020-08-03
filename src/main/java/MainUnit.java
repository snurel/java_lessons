public class MainUnit {
    public static void main(String[] args) {
        User user1 = new User("Samet", 35, "developer");
        User user2 = new User("Hakan", 30, "engineer");

        System.out.println(user1.getScore());
        System.out.println(user2.getScore());

        System.out.println(Util.formatName("Samet nurel"));

        System.out.println(Util.formatName("Hakan nurel"));

        System.out.println(Util.formatName("Faik Gürses"));

        user1.setScore(20);

        user2.setScore(15);

        int limit = User.LIMIT;

        User user3 = new User("meto");

        int score = user1.incrementScore();

        int age = 20;

        String userName = "hakan";
        Long money = 23465745756L;
        long money2 = 23465745756L;


        User user4 = new User("alis");

        System.out.println(user3.getName() + " age is: " + (user3.getAge() + 1));

        if(user1.getScore() >= user2.getScore()){
            System.out.println(user1.getName() + " beat " + user2.getName());
        }else{
            System.out.println(user2.getName() + " beat " + user1.getName());
        }



        Employee employee1 = new Employee();

        if(employee1.getUser() == null){
            System.out.println("There is no user for employee1");
        }else{
            System.out.println(employee1.getUser().getName());
        }

    }
}