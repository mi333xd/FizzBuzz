public class OperacionesTDD {
    public static int suma(String cadena){
        if (cadena.isEmpty()){
            return 0;
        } else {
            String[] numeros = cadena.split(",");
            int resultado = 0;
            for (String numero : numeros){
                if ((numero.equals(""))){
                    return -1;
                }
                if (cadena.endsWith(",")) {
                    return -1;
                }
                resultado += Integer.parseInt(numero);
            }
            return resultado;

        }
    }
}
