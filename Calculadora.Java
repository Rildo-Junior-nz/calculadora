public class Calculadora {

    private Usuario user;
    private String login = "rildo";
    private String senha = "rildonz";

    public Calculadora(Usuario user){
        this.user = user;
    }

    public String soma(double a, double b){
        if(this.user.login(this.login, this.senha)){
            return "A Soma de "+ a +" + "+ b +" é: " + (a + b);
        }else {
            return "O usuário não tem acesso!";
        }
    }

    public String subtrai(double a, double b){
        if(this.user.login(this.login, this.senha)){
            return "A Subtração de "+ a +" - "+ b +" é: " + (a - b);
        }else {
            return "O usuário não tem acesso!";
        }
    }

    public String multiplica(double a, double b){
        if(this.user.login(this.login, this.senha)){
            return "A Multiplicação de "+ a +" x "+ b +" é: " + (a * b);
        }else {
            return "O usuário não tem acesso!";
        }
    }
    public String divide(double a, double b){
        if(this.user.login(this.login, this.senha)){
            return "A Divisão de "+ a +" / "+ b +" é: " + (a / b);
        }else {
            return "O usuário não tem acesso!";
        }
    }

}
