public class TernarioOuBoolean {
    public static void main(String[] args) {

        /*boolean
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        */


        //ternário
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println(vamosAPraia);
        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);


    }
}
