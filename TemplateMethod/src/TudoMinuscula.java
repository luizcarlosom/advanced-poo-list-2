public class TudoMinuscula extends ProcessadorTexto {
    @Override
    public char[] converterCaracteres(char[] caracteres) {
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = Character.toLowerCase(caracteres[i]);
        }
        return caracteres;
    }
}