package org.springframework.test.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * userService 代理类
 * @Author troy
 * @Date 2025/5/16 下午1:45
 */
public class UserServiceHandler implements InvocationHandler {

    private final Object target;

    public UserServiceHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置处理方法");
        Object result = method.invoke(target, args);
        System.out.println("后置处理方法");
        return result;
    }

}
