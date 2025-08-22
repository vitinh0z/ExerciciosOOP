    package Construtores.ConstrutoresVerificadores;

    public class Main {

        public static void main(String[] args) {
            try{

                Account account = new Account(null,-32);
                System.out.println(account);
                
            } catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());

            }

        







        }
        
    }
