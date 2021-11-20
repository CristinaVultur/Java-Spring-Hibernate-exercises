package ex3.lab2.demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;

@Aspect //nu ne pune clasa de bean in context, ca sa facem asta trb sa o facem explicit
public class MyAspect {
    /**
     * idintificarea logicii de unde aspectul meu interine:
     * joinPoint => locul in care aspectul meu se aplica, metoda interceptata
     * (locul in care aspectul face interceptarea)
     * pointCut => imi identifica locul unde trebuie sa se faca interceptarea
     *
     *
     * Advice => cand si cum rulam noua logica de bissnes raportat la locul interceptat
     *
     * - Before (advice)
     * - After (advice)
     * -After Returning (advice
     * - After Throwing
     * -Around (cel mai puternic)
     */

    @Pointcut(value = "execution(* MainService.*(..))")
    public void operation(){}

  //  @Before("operation()")
    //public void log(JoinPoint joinPoint){
      //  System.out.println("Logging before " + joinPoint.getSignature().getName());
    //}

    @Around(("operation()")) //modifica parametrii cu care apelam functiile
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Logging before "+ proceedingJoinPoint.getSignature().getName());
        try{
            Object result = proceedingJoinPoint.proceed(new Object[]{"other test data"});
            return result;
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        return null;
    }


}
