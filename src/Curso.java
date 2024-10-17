public class Curso {
    private String nrc;
    private String paralelo;
    private String horario;

    public Curso() {
    }
    public Curso(String nrc, String paralelo, String horario) {
    }

    public String getNrc() {
        return nrc;
    }

    public String getParalelo() {
        return paralelo;
    }

    public String getHorario() {
        return horario;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String detalleCur(){
        return "NRC: "+getNrc()+"\n"+
                "Paralelo: "+getParalelo()+"\n"+
                "Horario: "+getHorario();
    }
}