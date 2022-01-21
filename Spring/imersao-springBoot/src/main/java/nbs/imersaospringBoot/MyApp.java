package nbs.imersaospringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;//Interface
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired//Injeção de dependencia
    private Calculadora calculadora;

    @Override//Sobrepõe o método abstrato
    public void run(String... args) throws Exception {//Caso de um erro irá lançar uma Exception
        System.out.println("O resutlado é= " + calculadora.calcular(4,10));

    }
}
