package com.nbs.simplificando.beans.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Autor autor = factory.getBean(Autor.class);
        Livro livro = factory.getBean(Livro.class);
        autor.setNome("Marcos");
        livro.setCodigo("923hdf");
        livro.setNome("SpringBott");
        livro.exibir();

    }


    }

