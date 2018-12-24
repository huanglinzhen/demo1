package com.hlz.controller;

import com.hlz.domain.Member;
import com.hlz.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller

public class zengshangMapper {

    @Autowired
    private MemberService memberService;

    @RequestMapping("members/chaxun")
    public String chaxun(int mid, HttpSession session){

        System.out.println("mid"+mid);
        Member member= memberService.findById(mid);
        System.out.println("name:"+member.getMname());
        session.setAttribute("member",member);
        return "redirect:/xiugai.jsp";
    }
    @RequestMapping("members/dewenjian")
    public String shangchu(int mid, HttpSession session){
       int count= memberService.deleteMember(mid);
       session.setAttribute("msg","删除成功");
        return "redirect:/index.html";
    }
}
