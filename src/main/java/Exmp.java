public class Exmp {
    public static void main(String[] args) {

        String log = "127.123.132.1 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326 \"http://www.example.com/start.html\" \"Mozilla/4.08 [en] (Win98; I ;Nav)\")";
        int a = log.indexOf("-");
        System.out.println(log.substring(0,a).trim());
    }
}
