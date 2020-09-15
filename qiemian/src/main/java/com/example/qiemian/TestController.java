package com.example.qiemian;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

/**
 * @Classname TestController
 * @Description TODO
 * @Date 2020/9/7 11:33
 * @Created by zhangtao
 */
@RestController
public class TestController {
    @RequestMapping("test")
    @MyZhujie
    public String aaa(HttpServletRequest request){
        HttpSession session = request.getSession();
        System.out.println(session);

        System.out.println();
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String header = request.getHeader(headerNames.nextElement());
            System.out.println(header);
        }
        return "hello";
    }
    @RequestMapping("/heihei/{aaa}")
    @MyZhujie
    public String heihei(@PathVariable String aaa ){
        System.out.println(aaa);
        System.out.println("hihei");
        return "heihei";
    }
}
