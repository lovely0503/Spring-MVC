package com.kh.spring.member.model.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Data
public class MemberDto {
	private String userId;
	private String userPwd;
	private String userName;
	private String email;
	private Date enrollDate;
	private Date modifyDate;
	private String status;
	
}
