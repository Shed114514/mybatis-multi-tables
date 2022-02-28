package com.shed.mapper;

import com.shed.domain.Member;

import java.util.List;

public interface MemberMapper {

    List<Member> selectMemberAndOrders();

}
