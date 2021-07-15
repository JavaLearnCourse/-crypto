package org.texttool.javalearncourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.texttool.javalearncourse.crypto.CryptoTool;


public class MainClass {



    public static void main(String[] args) {

        // Не удалять
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(MyScan.class);
        //Не удалять
       /* ctx.refresh();
        CryptoTool ct = ctx.getBean(CryptoTool.class);
        System.out.println(ct.encrypt());
        */
    }
}
