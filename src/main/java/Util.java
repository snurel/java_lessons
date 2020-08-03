public class Util {
    public static String formatName(String name){
        String[] strings = name.split(" ");

        // return strings[0] + " "+ strings[1].toUpperCase().charAt(0) + ".";
        return String.format("%s %s.", strings[0], strings[1].toUpperCase().charAt(0));

    }
}
