package entidade;

import java.util.Date;

public class Emprestimo {
    private int id;
    private Date dt_emprestimo;
    private Date dt_devolucao;
    private double valor;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
