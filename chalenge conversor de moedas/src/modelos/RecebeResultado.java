package modelos;

public record RecebeResultado(String conversion_result) {
    @Override
    public String toString() {
        return "Valor convertido: "+ conversion_result;
    }
}
