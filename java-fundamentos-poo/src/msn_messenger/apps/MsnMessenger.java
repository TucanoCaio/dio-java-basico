package msn_messenger.apps;

import msn_messenger.service.ServicoMensagemInstantanea;

public class MsnMessenger extends ServicoMensagemInstantanea {

    public void enviarMensagem() {

        validarConexao();

        System.out.println("Enviando mensagem pelo MSN...");

        salvarHistorico();
    }

    public void receberMensagem () {
        System.out.println("Mensagem recebida pelo MSN");

        salvarHistorico();
    }

    protected void salvarHistorico () {
        System.out.println("Salvando historico pelo MSN...");
    }  
}
