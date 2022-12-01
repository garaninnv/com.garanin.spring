package aop.aspects;


import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    public void allMetodsFromUniLibrary () {}
//
//    @Pointcut("execution(public void returnMagazin())")
//    public void returnMetodsFromUniLibrary () {}
//
//    @Pointcut("allMetodsFromUniLibrary() && !returnMetodsFromUniLibrary()")
//    public void allMetodsExceptReturnMagazineFromUniLibrary() {}
//
//    @Before("allMetodsExceptReturnMagazineFromUniLibrary()")
//    public void beforAllMetodsExceptReturnMagazineAdvice () {
//        System.out.println("beforAllMetodsExceptReturnMagazineAdvice: log #10");
//    }

//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    public void allGetMetodsFromUnilibrary() {}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    public void allReturnMetodsFromUnilibrary() {}
//
//    @Pointcut("allGetMetodsFromUnilibrary() || allReturnMetodsFromUnilibrary()")
//    public void allGetAndReturnMetodsFromUnilibrary() {}
//
//    @Before("allGetMetodsFromUnilibrary()")
//    public void beforGetLogingAdvance () {
//        System.out.println("beforGetLogingAdvance write login #1");
//    }
//
//    @Before("allReturnMetodsFromUnilibrary()")
//    public void beforReturnLogingAdvance () {
//        System.out.println("allReturnMetodsFromUnilibrary write login #2");
//    }
//
//    @Before("allGetAndReturnMetodsFromUnilibrary()")
//    public void beforGetAndReturnLogingAdvance () {
//        System.out.println("beforGetAndReturnLogingAdvance write login #3");
//    }



    @Before("aop.aspects.MyPointcuts.allAddMetods()")
    public void beforeAddLogingAdvice (JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj:arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге : название книги " + myBook.getNameBook() +
                            " автор " + myBook.getAutor() + " дата публикации " + myBook.getYearOfPublication());
                } else if (obj instanceof String) {
                    System.out.println("Книгу в библиотеку добавляет " + obj);
                }
            }
        }
        System.out.println("beforeAddLogingAdvice логирование попытки получить книгу/журнал");
        System.out.println("---------------------------------------------");
    }


}
