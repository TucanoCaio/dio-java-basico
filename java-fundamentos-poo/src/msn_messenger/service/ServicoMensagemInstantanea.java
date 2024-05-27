package msn_messenger.service;

public abstract class ServicoMensagemInstantanea {

    public abstract void enviarMensagem();
    public abstract void receberMensagem ();
    protected abstract void salvarHistorico ();
    protected void validarConexao () {
        System.out.println("Conectado a Internet");
    }
}

    
