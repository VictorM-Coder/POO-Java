package pulapula;

public class Manual {
    public static void main(String[] args) {

        //case unico
        Trampoline trampoline = new Trampoline();
        trampoline.arrive(new Kid("mario", 5));
        trampoline.arrive(new Kid("livia", 4));
        trampoline.arrive(new Kid("luana", 3));
        System.out.println(trampoline);
        //=> luana:3 livia:4 mario:5 => [ ]

        //case entrando
        trampoline.in();
        System.out.println(trampoline);
        //=> luana:3 livia:4 => [ mario:5 ]
        trampoline.in();
        System.out.println(trampoline);
        //=> luana:3 => [ livia:4 mario:5 ]

        //case saindo
        trampoline.out();
        System.out.println(trampoline);
        //=> mario:5 luana:3 => [ livia:4 ]
    }
}