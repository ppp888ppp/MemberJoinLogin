package com.nyu.MemberJoin.member.dao;

import com.nyu.MemberJoin.member.Member;

public interface IMemberDao {
	int memberInsert(Member member);
	Member memberSelect(Member member);
	int memberUpdate(Member member);
	int memberDelete(Member member);
}
