package com.kodilla.agent;

import net.bytebuddy.asm.Advice;

public class UserMethodsMonitor {

    @Advice.OnMethodEnter
    public static void enter(@Advice.Origin Class clazz, @Advice.Origin("#m") String methodName) {
        System.out.printf("Called: %s()%n", methodName);
    }

}