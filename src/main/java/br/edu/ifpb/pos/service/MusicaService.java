
package br.edu.ifpb.pos.service;

import br.edu.ifpb.pos.model.Musica;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

/**
 *
 * @author Michelle Oliveira
 * @mail miolivc@outlook.com
 * @since 13/12/2017
 */

public class MusicaService {

    private static String uri;
    private final String apikey="660a4395f992ff67786584e238f501aa";
    
    private Client client = ClientBuilder.newClient();
    
    public MusicaService(String period, String scope) {
        this.uri =  String.format("https://api.vagalume.com.br/rank.php?type=mus&"
            + "period={%s}&scope={%s}&apikey=660a4395f992ff67786584e238f501aa", 
                period, scope);
    }
    
    public Musica get() {
        WebTarget root = client.target(uri);
        Response response = root.request().get();
        
        return null;
    }
    
}
