package com.homestay.korea.service;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSessionException;
import org.springframework.ui.Model;

import com.homestay.korea.DTO.MemberDTO;


public interface IJoinMemberService {
	//����
	int insertMember(MemberDTO dto) throws SQLException;


}
