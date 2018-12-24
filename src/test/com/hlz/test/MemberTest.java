package com.hlz.test;


import com.hlz.domain.Member;
import com.hlz.service.MemberService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MemberTest {
   @Test
    public void  tset1(){
       ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
       MemberService memberService=ctx.getBean("memberService", MemberService.class);
       Member member=new Member();
       member.setMname("不想考试");
       member.setMphone("1236545532");
       member.setMlevel(1);


      DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");

      java.util.Date date = new Date();

      String  strr ="2007-1-18";
      try {
         date= format1.parse(strr);
      } catch (ParseException e) {
         e.printStackTrace();
      }
      System.out.println(date);
      Timestamp time=new Timestamp (date.getTime());

      member.setMcardNo("113265");
       int count=memberService.updateMember(member);
      System.out.println(count);
   }



           /* ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    BookService bookService=ctx.getBean("bookService", BookService.class);
    Book book=bookService.findById(1);*/
}
