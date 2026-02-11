package org.example.Redes_Sociales;

public class RedSocialApp {
    static void main() {

        Usuario ana = new Usuario("Ana",30,"ana",231);

        Influencer luis = new Influencer("Luis",25,"luis_influencer",50000);
        luis.anyadirColab("MediaMarkt");
        luis.anyadirColab("Yoigo");
        luis.anyadirColab("Temu");

        Streamer carlos = new Streamer("Carlos",27,"carlos_stream",15,150,2000);

        Basico persona_normal = new Basico("Pedro",22,"pedro123",455);

        ana.mostrarInfo();
        luis.mostrarInfo();
        carlos.mostrarInfo();
        persona_normal.mostrarInfo();




    }
}
