public class User {
    private String name;
    private int age;
    private String job;
    private int score;

    public static int LIMIT = 20;

    public String email;

    public User(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.score = LIMIT;
    }

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getJob(){
        return job;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int newScore){
        this.score = newScore;
    }

    public int incrementScore(){
        this.score++;
        return this.score;
    }

    public String getAgeStatus(){
        if(age > LIMIT){
            return name + " is old!";
        }else{
            return name + " is young!";
        }
    }
}
