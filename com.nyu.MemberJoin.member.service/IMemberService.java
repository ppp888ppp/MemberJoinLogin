package com.nyu.MemberJoin.member.service;

import com.nyu.MemberJoin.member.Member;

public interface IMemberService 
{
	void memberRegister(Member member);
	Member memberSearch(Member member);
	Member memberModify(Member member);
	int memberRemove(Member member);
}
