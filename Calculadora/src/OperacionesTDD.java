public class OperacionesTDD {
    public static int suma(String cadena){
        if (cadena.isEmpty()){
            return 0;
        } else {
            String[] numeros = cadena.split(",");
            int resultado = 0;
            StringBuilder numerosNegativos = new StringBuilder();
            for (String numero : numeros){
                if ((numero.equals(""))){
                    return -1;
                }
                if (cadena.endsWith(",")) {
                    return -1;
                }
                int valorNumero = Integer.parseInt(numero);
                if (valorNumero < 0) {
                    numerosNegativos.append(numero).append(",");
                }
                resultado += valorNumero;
            }
            if (numerosNegativos.length() > 0) {
                String mensajeError = "Número negativo no permitido: " + numerosNegativos.toString().substring(0, numerosNegativos.length()-1);
                return -1;
            }
            return resultado;
        }
    }
}
