package io.vinson.consumer;

import io.vinson.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JiangWeixin on 2018/12/7.
 */
public class Consumer {

    public static void main(String[] args) {
        test1();
    }

    public static void main1(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"META-INF/spring/consumer.xml"});
        context.start();
        // Obtaining a remote service proxy
        DemoService demoService = (DemoService)context.getBean("demoService");
        // Executing remote methods
        String hello = demoService.sayHello("world");
        // Display the call result
        System.out.println(hello);

        int result = demoService.calAttack(1, 1000);

        System.out.println(result);

    }

    public static void test1() {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.removeIf(item -> item % 2 == 0);
        list.forEach(item -> System.out.println(item));

        list.forEach(item -> {

        });

        list.removeIf(item -> {

            return false;
        });
    }

}
