public class BinOps {
    public String sum(String a, String b) {

        int arg0 = Integer.parseInt(a, 2);
        int arg1 = Integer.parseInt(b, 2);
        int sum = arg0 + arg1;

        return Integer.toBinaryString(sum);
    }

    public String mult(String a, String b) {
        int arg0 = Integer.parseInt(a, 2);
        int arg1 = Integer.parseInt(b, 2);
        int mult = arg0 * arg1;

        return Integer.toBinaryString(mult);
    }
}