public class App {
    public static void main(String[] args) {


        Usuario usuarioCorreto = new Usuario("rildo","rildo","rildonz");
        boolean retornoUsuarioCorreto = usuarioCorreto.login("rildo","rildonz");
        System.out.println("Testando usuario correto...");
        System.out.println("O login e senha está:" + retornoUsuarioCorreto);

        Usuario usuarioIncorreto = new Usuario("rildo","rildo","senhaErrada");
        boolean retornoUsuarioIncorreto = usuarioIncorreto.login("rildo","rildonz");
        System.out.println("Testando usuario incorreto...");
        System.out.println("O login e senha está:" + retornoUsuarioIncorreto+"\n");


        Calculadora calculadoraUsuarioCorreto = new Calculadora(usuarioCorreto);

        System.out.println("Testando usuario correto...");
        System.out.println("Testando soma...");
        System.out.println(calculadoraUsuarioCorreto.soma(1.2,1.3));
        System.out.println("Testando subtração...");
        System.out.println(calculadoraUsuarioCorreto.subtrai(5.2,1.3));
        System.out.println("Testando multiplicação...");
        System.out.println(calculadoraUsuarioCorreto.multiplica(5.0,2.0));
        System.out.println("Testando divisão...");
        System.out.println(calculadoraUsuarioCorreto.divide(6.0,2.0)+"\n");


        Calculadora calculadoraUsuarioIncorreto = new Calculadora(usuarioIncorreto);
        System.out.println("Testando usuario incorreto...");
        System.out.println("Testando soma...");
        System.out.println(calculadoraUsuarioIncorreto.soma(1.2,1.3));
        System.out.println("Testando subtração...");
        System.out.println(calculadoraUsuarioIncorreto.subtrai(5.2,1.3));
        System.out.println("Testando multiplicação...");
        System.out.println(calculadoraUsuarioIncorreto.multiplica(5.0,2.0));
        System.out.println("Testando divisão...");
        System.out.println(calculadoraUsuarioIncorreto.divide(6.0,2.0));


    }
}
