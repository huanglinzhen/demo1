package com.hlz.service;

import com.hlz.domain.Member;

import java.util.List;
import java.util.Map;

/**
 * @author shining
 */
public interface MemberService {


    int addMember(Member member);


    int updateMember(Member member);


    int deleteMember(int mid);


    Member findById(int mid);

    List<Member> find(Map<String, Object> map);
    int Updenm(Member member);
}
