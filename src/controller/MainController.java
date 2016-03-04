/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import function.support.GetStringFromURL;
import function.support.HandleJson;
import model.User;
//import org.apache.http
/**
 *
 * @author magic_000
 */

@Controller
public class MainController {
    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public String hello(Model m){
        m.addAttribute("Greeting", "Hello Spring World");
        m.addAttribute("clientId", "f183231a6f9697fd0318");
        return "login";
    }
    
    
    //URL prameter, sử dụng tham số trên url
    @RequestMapping(value = "/use")
    public String userInfo(Model m, @RequestParam(value="name", defaultValue="RedApple")String name){
        m.addAttribute("name", name);
        m.addAttribute("email", "magicghost.vu@gmail.com");
        
        
        return "user";
    }
    @RequestMapping(value = "/callback")
    public String callBack(Model m, @RequestParam(value = "code", defaultValue = "0x0000")  String code){
        //m.addAttribute("code", code);
        String tmpUrl="https://github.com/login/oauth/access_token?client_id=%s&client_secret=%s&code=%s&accept=json";
        String url=String.format(tmpUrl, "f183231a6f9697fd0318","ea38196a339fb63b3d6e719a43f5cda859eddd5f", code );
        
        m.addAttribute("url", url);
        String tokenAccess=GetStringFromURL.getString(url);
        
        m.addAttribute("token", tokenAccess);
        
        String[] listContent=tokenAccess.split("&");
        String t=listContent[0].split("=")[1];
        m.addAttribute("t", t);
        
        
        
        String JSON_content= GetStringFromURL.getString("https://api.github.com/user?access_token="+t);
        User u=getUserMap(HandleJson.parse(JSON_content));
        
        //m.addAttribute("json", JSON_content);
        
        m.addAttribute("user", u);
        
        return "user-info";
    }
    User getUserMap(Map m){
        User u=new User();
        u.setId(Long.toString((long)m.get("id")));
        u.setName((String)m.get("login"));
        u.setFullName((String)m.get("name"));
        u.setUrl((String)m.get("html_url"));
        u.setLocation((String)m.get("location"));
        u.setAvtUrl((String)m.get("avatar_url"));
        return u;
    }
    /*@RequestMapping(value = "/css")
    public String testCss(){
        return "user-info";
    }*/
    
}
