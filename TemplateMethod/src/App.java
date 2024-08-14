public class App {
    public static void main(String[] args) throws Exception {
        ProcessadorTexto conversorMaiuscula = new TudoMaiuscula();
        String textoOriginal = "Exemplo de Texto";
        String textoMaiusculo = conversorMaiuscula.converterTexto(textoOriginal);
        System.out.println("Texto original: " + textoOriginal);
        System.out.println("Texto em maiúsculas: " + textoMaiusculo);

        ProcessadorTexto conversorMinuscula = new TudoMinuscula();
        String textoMinusculo = conversorMinuscula.converterTexto(textoOriginal);
        System.out.println("Texto original: " + textoOriginal);
        System.out.println("Texto em minúsculas: " + textoMinusculo);
    }
}
