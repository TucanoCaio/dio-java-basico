package msn_messenger.client;

import msn_messenger.apps.FacebookMessenger;
import msn_messenger.apps.MsnMessenger;
import msn_messenger.apps.Telegram;
import msn_messenger.service.ServicoMensagemInstantanea;


public class Usuario {
    
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        String appUtilizado = "FBM";

        if (appUtilizado == "MSN"){
            smi = new MsnMessenger();
        }else if (appUtilizado == "FBM"){
            smi = new FacebookMessenger();
        }else if (appUtilizado == "TLG") {
            smi = new Telegram();
        }else{
            System.out.println("Nenhum APP em uso");
        }

        smi.enviarMensagem();
        smi.receberMensagem();

        /*System.out.println("");
        System.out.println("MSN");

        MsnMessenger msn = new MsnMessenger();
        msn.enviarMensagem ();
        msn.receberMensagem();

        System.out.println("");
        System.out.println("Facebook");

        FacebookMessenger fbm = new FacebookMessenger();
        fbm.enviarMensagem();
        fbm.receberMensagem();

        System.out.println("");
        System.out.println("Facebook");

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();*/

        
    }
}
