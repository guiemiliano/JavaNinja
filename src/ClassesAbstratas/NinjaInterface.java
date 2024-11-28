package ClassesAbstratas;

/*
    A maior diferença entre interface e classes abstratas
    é que em interface, tudo que se tem é abstrato e não tem
    nenhum corpo de código, também não pode criar atributos
    para serem atribuídos depois, pois tudo é automaticamente
    final, como se fosse uma constante.

    Enquanto as classes abstratas podem ter métodos
    criar atributos, métodos abstratos e métodos comuns.
 */

public interface NinjaInterface {

    //OBRIGATORIAMENTE ABSTRATO
    void tacarKunai();
}
