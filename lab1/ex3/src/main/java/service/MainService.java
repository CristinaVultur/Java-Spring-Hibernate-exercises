package service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repository.MainRepository;

@Component
public class MainService {

    private final MainRepository mainRepository;

    /**
     * 1. @Autowierd pe field
     * 2. @Autowierd pe constructor-- asa se prefera
     * -daca il pun pe constructor pot sa pun final
     * (trb sa folosim imutabilitatea)
     * -pt teste unitare vom sti din constructor sa ii dam dependintele
     * -consedinte : dependinte ciclice, ce se rezolva punand pe field
     * 3. Pe setter (neindicat)
     */
    @Autowired //asa cum isi face Spring dependency injection , injectezi dintr-o componenta in alta;
    public MainService(MainRepository mainRepository){
        this.mainRepository = mainRepository;
    }//daca folosesc constructiori stie singur sa isi faca autowierded


    public String sayHello(){
        return mainRepository.sayHello();
    }
}
