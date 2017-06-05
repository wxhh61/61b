import java.io.*;
class Nuke2 {
    public static void main(String[] args) throws Exception {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = keyboard.readLine();
        System.out.println(inputLine.substring(0,1) + inputLine.substring(2));
    }
}
