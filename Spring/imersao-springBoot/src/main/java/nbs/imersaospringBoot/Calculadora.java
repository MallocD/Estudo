package nbs.imersaospringBoot;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {

    public int calcular(int n1, int n2){
        return n1+n2;
    }
}
