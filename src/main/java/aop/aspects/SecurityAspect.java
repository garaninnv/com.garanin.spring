package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("aop.aspects.MyPointcuts.allAddMetods()")
    public void beforeAddSecurityAdvice () {
        System.out.println("beforeAddSecurityAdvice проверка прав на получение книги/журнала");
        System.out.println("---------------------------------------------");
    }
}
