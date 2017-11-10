package top.cmoon.commons.vo.starter;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(ExVOAutoConfiguration.class)
@Inherited
public @interface EnableExVo {

}
