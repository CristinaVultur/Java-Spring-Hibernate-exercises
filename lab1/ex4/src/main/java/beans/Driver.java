package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Driver {
    @Autowired
    private Car car;

    //public Driver(Car car){
      //  this.car = car;
    //}
}

