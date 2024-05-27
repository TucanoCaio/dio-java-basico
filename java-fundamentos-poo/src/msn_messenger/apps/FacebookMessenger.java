package msn_messenger.apps;

import msn_messenger.service.ServicoMensagemInstantanea;

public class FacebookMessenger extends ServicoMensagemInstantanea {

    public void enviarMensagem() {

        validarConexao();

        System.out.println("Enviando mensagem pelo Facebook...");

        salvarHistorico();
    }

    public void receberMensagem () {
        System.out.println("Mensagem recebida pelo Facebook");

        salvarHistorico();
    }

    protected void salvarHistorico () {
        System.out.println("Salvando historico pelo Facebook...");
    }

    
    
}
