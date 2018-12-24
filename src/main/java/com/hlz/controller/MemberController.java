package com.hlz.controller;

import com.hlz.domain.Member;
import com.hlz.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shining
 */
@RestController
@RequestMapping("/members")

public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping
    public List<Member> find(@RequestParam(value = "mname",required = false) String mname,
                             @RequestParam(value = "mcardNo",required = false) String mcardNo){
        Map<String,Object> map=new HashMap<>();
        if(mname!=null){
            map.put("mname","%"+mname+"%");
        }
        if(mcardNo!=null){
            map.put("mcardNo","%"+mcardNo+"%");
        }
        return memberService.find(map);
    }


    @RequestMapping("/login")
    public   Map<String,Object> Login(Member member){
       int count =memberService.Updenm(member);
       ;
        Map<String,Object> results=new HashMap<>();

        results.put("count",count);
        return results;

    }

    @RequestMapping("/xiugai2")
    public  Map<String,Object> xiugau_2(Member member){
        System.out.println("mid"+member.getMid());
        System.out.println("name"+member.getMname());
        Map<String,Object> results=new HashMap<>();
        int count =memberService.updateMember(member);
        results.put("count",count);
        return results;

    }

}
