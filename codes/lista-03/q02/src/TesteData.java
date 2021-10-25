public class TesteData {
    public static void main(String[] args) {
        Data data = new Data((byte) 29, (byte) 2, (short) 2000);

        System.out.println(data);
        System.out.println(data.isBissexto());
    }
}
