package msn_messenger.apps;

import msn_messenger.service.ServicoMensagemInstantanea;

public class Telegram extends ServicoMensagemInstantanea {

    public void enviarMensagem() {

        validarConexao();

        System.out.println("Enviando mensagem pelo Telegram...");

        salvarHistorico();
    }

    public void receberMensagem () {
        System.out.println("Mensagem recebida pelo Telegram");

        salvarHistorico();
    }

    protected void salvarHistorico () {
        System.out.println("Salvando historico pelo Telegram...");
    }   
}
