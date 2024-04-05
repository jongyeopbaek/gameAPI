package com.bjy.gg.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.bjy.gg.dto.UserDTO;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UserDAO {
final SqlSession sqlsession;

public List<UserDTO> selectUserList(){
	return sqlsession.selectList("user.userList");
}
	
	
}
