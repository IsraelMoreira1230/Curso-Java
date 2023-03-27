package JavaOrientacaoObjeto;

public enum Turno {
    MANHA(1, "Manhã"),
    TARDE(2, "Tarde"),
    NOITE(3, "Noite");

    private int cod;
    private String descricao;

    Turno(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCodigo() {
        return cod;
    }

}

class EnumTestes {

    public static void main(String[] args) {
        System.out.println("Turno: " + Turno.values());

        for (Turno t : Turno.values()) {
            System.out.println("Turno: " + t.getDescricao());
        }
    }

}
