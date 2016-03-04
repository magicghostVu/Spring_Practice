/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function.support;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.client.fluent.Request;

/**
 *
 * @author magic_000
 */
public class GetStringFromURL {

    public static String getString(String url) {
        String res = null;
        try {
            res = Request.Get(url)
                    .setHeader("Accept-Charset", "utf-8").execute().returnContent().asString();

            System.out.println(res);
        } catch (IOException ex) {
            Logger.getLogger(GetStringFromURL.class.getName()).log(Level.SEVERE, null, ex);
        }

        return res;
    }
}
