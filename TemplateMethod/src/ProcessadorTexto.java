public abstract class ProcessadorTexto {
    public String converterTexto(String entrada) {
        char[] caracteres = extrairCaracteres(entrada);
        char[] caracteresConvertidos = converterCaracteres(caracteres);
        String resultado = juntarCaracteres(caracteresConvertidos);
        return resultado;
    }

    public char[] extrairCaracteres(String texto) {
        return texto.toCharArray();
    }

    public abstract char[] converterCaracteres(char[] caracteres);

    public String juntarCaracteres(char[] caracteres) {
        return new String(caracteres);
    }
}