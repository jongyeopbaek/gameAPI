package com.bjy.gg.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjy.gg.dao.UserDAO;
import com.bjy.gg.dto.UserDTO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController {
 final UserDAO userDAO;
	
 @RequestMapping("userList")
 public String userList(Model model) {
	 List<UserDTO> list = userDAO.selectUserList();
	 
	 model.addAttribute("list", list);
	 
	 return "userList";
 }
	
 
 
 
 
}
