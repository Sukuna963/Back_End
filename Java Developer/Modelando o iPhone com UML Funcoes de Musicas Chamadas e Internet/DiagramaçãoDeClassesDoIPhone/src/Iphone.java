import Widgets.Email;
import Widgets.Foto;
import Widgets.GoogleMaps;
import Widgets.Ipod;
import Widgets.Safari;
import Widgets.Sms;
import Widgets.Stock;
import Widgets.Telefone;
import Widgets.Weather;

public class Iphone {
    public static void main(String[] args) throws Exception {
        Ipod ipod = new Ipod();
        ipod.navegar();
        ipod.clicar();
        ipod.aumentarVolume();
        ipod.diminuirVolume();
        ipod.adiantar();
        ipod.pausar();

        System.out.println("-----------------------------------------------------");

        Telefone telefone = new Telefone();
        telefone.receber();
        telefone.colocarEspera();
        telefone.conferencia();
        telefone.desligar();
        telefone.navegar();
        telefone.clicar();
        System.out.println("Numero do telefone errado...");
        telefone.discar();
        telefone.aumentarVolume();
        telefone.diminuirVolume();

        System.out.println("-----------------------------------------------------");

        Safari safari = new Safari();
        safari.buscar();
        safari.clicar();
        safari.navegar();
        safari.aumentarZoom();
        safari.diminuirZoom();
        safari.abrirAba();

        System.out.println("-----------------------------------------------------");

        Email email = new Email();
        email.clicar();
        email.discar();
        email.digitar();
        email.enviar();
        email.receber();
        email.navegar();

        System.out.println("-----------------------------------------------------");

        Sms sms = new Sms();
        sms.clicar();
        sms.discar();
        sms.digitar();
        sms.enviar();
        sms.receber();
        sms.navegar();

        System.out.println("-----------------------------------------------------");

        Foto foto = new Foto();
        foto.navegar();
        foto.clicar();
        foto.aumentarZoom();
        foto.diminuirZoom();
        foto.definirPapelParede();

        System.out.println("-----------------------------------------------------");

        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.pegarLocalizacaoUsuario();
        googleMaps.buscar();
        googleMaps.navegar();
        googleMaps.aumentarZoom();
        googleMaps.clicar();
        googleMaps.diminuirZoom();

        System.out.println("-----------------------------------------------------");

        Stock stock = new Stock();
        stock.buscar();
        stock.navegar();
        stock.clicar();

        System.out.println("-----------------------------------------------------");
        
        Weather Weather = new Weather();
        Weather.buscar();
        Weather.navegar();
        Weather.clicar();

    }
}
