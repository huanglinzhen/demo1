package com.hlz.dao;

import com.hlz.domain.Member;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @author shining
 */
public interface MemberMapper {

    @Insert("insert into sjk_member values" +
            "(null,#{mname},#{mphone},#{mlevel}," +
            "now(),#{mcardNo})")
    int addMember(Member member);

    @Update("update sjk_member set mname=#{mname}," +
            "mphone=#{mphone},mlevel=#{mlevel}," +
            "mcardno=#{mcardNo} where mid=#{mid}")
    int updateMember(Member member);

    @Delete("delete from sjk_member where mid=#{mid}")
    int deleteMember(@Param("mid") int mid);

    @Select("select  mid, mname, mphone," +
            " mlevel,minTime, mcardNo" +
            " from sjk_member where mid=#{mid}")

    Member findById(@Param("mid") int mid);

    List<Member> find(Map<String, Object> map);
  @Insert("insert into sjk_member values" +
          "(null,#{mname},#{mphone},#{mlevel}," +
          "now(),#{mcardNo})")
    int Updenm(Member member);


}
