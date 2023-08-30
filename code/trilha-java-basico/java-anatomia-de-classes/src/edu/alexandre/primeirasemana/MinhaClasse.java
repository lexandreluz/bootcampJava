package edu.alexandre.primeirasemana;
public class MinhaClasse {
    public static void main(String [] args){
        System.out.println("Meu primeiro código em java?");
        String nomeCompleto = nomeCompleto("Alexandre", "Luz");
    System.out.println("Nome: " + nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}

