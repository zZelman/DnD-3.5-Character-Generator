package test;

public class Playground {
    public static void main(String args[]) {
        String s = "none";
        String[] splits = s.split(",");
        for (String tmp : splits)
            System.out.println(tmp);
    }
}
