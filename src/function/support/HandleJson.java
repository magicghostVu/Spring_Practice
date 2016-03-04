/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function.support;
import java.util.Map;

import org.json.simple.parser.JSONParser;
/**
 *
 * @author magic_000
 */
public class HandleJson {
    
    public static Map parse(String json){
        Map res=null;
        JSONParser parser=new JSONParser();
        try {
            Object o= parser.parse(json);
            
            res=(Map)o;
        } catch (Exception e) {
            
        }
        
        
        
        return res;
    }
    /*public static void main(String[] args) {
        String json="{\"login\":\"magicghostVu\",\"id\":14235526,\"avatar_url\":\"https://avatars.githubusercontent.com/u/14235526?v=3\",\"gravatar_id\":\"\",\"url\":\"https://api.github.com/users/magicghostVu\",\"html_url\":\"https://github.com/magicghostVu\",\"followers_url\":\"https://api.github.com/users/magicghostVu/followers\",\"following_url\":\"https://api.github.com/users/magicghostVu/following{/other_user}\",\"gists_url\":\"https://api.github.com/users/magicghostVu/gists{/gist_id}\",\"starred_url\":\"https://api.github.com/users/magicghostVu/starred{/owner}{/repo}\",\"subscriptions_url\":\"https://api.github.com/users/magicghostVu/subscriptions\",\"organizations_url\":\"https://api.github.com/users/magicghostVu/orgs\",\"repos_url\":\"https://api.github.com/users/magicghostVu/repos\",\"events_url\":\"https://api.github.com/users/magicghostVu/events{/privacy}\",\"received_events_url\":\"https://api.github.com/users/magicghostVu/received_events\",\"type\":\"User\",\"site_admin\":false,\"name\":\"Vũ Hồng Phú\",\"company\":null,\"blog\":null,\"location\":\"Hà Nội, Việt Nam. \",\"email\":\"magicghost.vu@gmail.com\",\"hireable\":null,\"bio\":null,\"public_repos\":1,\"public_gists\":0,\"followers\":0,\"following\":0,\"created_at\":\"2015-09-11T13:25:46Z\",\"updated_at\":\"2016-03-04T08:32:12Z\"}";
        JSONParser parser=new JSONParser();
        
        try {
            Object o= parser.parse(json);
            Map m=(Map)o;
            System.out.println(m.get("login"));
            
        } catch (ParseException ex) {
            Logger.getLogger(HandleJson.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }*/
    
    
    
}
