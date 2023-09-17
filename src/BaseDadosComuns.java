public abstract class BaseDadosComuns extends BaseIdentificador{
    protected String codigoRenavam;
    protected String cidadeUF;
    protected String estadoUF;
    public String getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    public String getCidadeUF() {
        return cidadeUF;
    }
    public void setCidadeUF(String cidadeUF) {
        this.cidadeUF = cidadeUF;
    }
    public String getEstadoUF() {
        return estadoUF;
    }
    public void setEstadoUF(String estadoUF) {
        this.estadoUF = estadoUF;
    }
    public BaseDadosComuns(int codigo, String codigoRenavam, String cidadeUF, String estadoUF) {
        super(codigo);
        this.codigoRenavam = codigoRenavam;
        this.cidadeUF = cidadeUF;
        this.estadoUF = estadoUF;
    }
    
}
