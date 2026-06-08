package com.kh.spring.member.model;

import com.kh.spring.member.model.dto.MemberDto;

//현업에서 많이 사용되는 인터패턴
public interface MemberService {

	void login(MemberDto member);
}
