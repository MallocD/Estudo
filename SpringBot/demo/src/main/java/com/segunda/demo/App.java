package com.segunda.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);



        Livro livro = factory.getBean(Livro.class);
        livro.setNome("GOT");
        livro.setCodigo("1d3");

        Autor autor = factory.getBean(Autor.class);
        autor.setNome("Prisma");
        livro.exibirLivro();
    }
}
