package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;

import org.springframework.cglib.core.TinyBitSet;

@Entity
@Table(name="TB_USER")
public class User {
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long seq;
	
	@Column@Valid
	private String USER_KEY;
	@Column@Valid
	private String USER_STATUS;
	@Column@Valid
	private String EMAIL;
	@Column@Valid
	private String NAME;
	@Column@Valid
	private String PHONE_NUM;
	@Column@Valid
	private LocalDateTime AGREE_GCCS_DT;
	@Column@Valid
	private LocalDateTime AGREE_PERSON_DT;
	@Column@Valid
	private LocalDateTime AGREE_DEVICE_DT;
	@Column@Valid
	private String ICONS;
//	@Column@Valid
//	private int AUTH_TYPE;
//	@Column@Valid
//	private int PUSH_COUNT;
	@Column@Valid
	private LocalDateTime REG_DT;
	@Column@Valid
	private LocalDateTime UPT_DT;
	
	public User() {
		super();
	}
	
	public User(Long seq, String USER_KEY, String USER_STATUS, String EMAIL, String NAME, String PHONE_NUM, LocalDateTime AGREE_GCCS_DT, LocalDateTime AGREE_PERSON_DT, LocalDateTime AGREE_DEVICE_DT, String ICONS, /*int AUTH_TYPE, int PUSH_COUNT,*/ LocalDateTime REG_DT, LocalDateTime UPT_DT) {
		super();
		this.seq = seq;
		this.USER_KEY = USER_KEY;
		this.USER_STATUS = USER_STATUS;
		this.EMAIL = EMAIL;
		this.PHONE_NUM = PHONE_NUM;
		this.AGREE_GCCS_DT = AGREE_GCCS_DT;
		this.AGREE_PERSON_DT = AGREE_PERSON_DT;
		this.AGREE_DEVICE_DT = AGREE_DEVICE_DT;
		this.ICONS = ICONS;
//		this.AUTH_TYPE = AUTH_TYPE;
//		this.PUSH_COUNT = PUSH_COUNT;
		this.REG_DT = REG_DT;
		this.UPT_DT = UPT_DT;
	}
	
	public Long getSeq() {
        return seq;
    }
	public void setSeq(Long seq) {
        this.seq = seq;
    }
	
	public String getUserKey() {
		return USER_KEY;
	}
	public void setUserKey(String USER_KEY) {
		this.USER_KEY = USER_KEY;
	}
	
	public String getUserStatus() {
		return USER_STATUS;
	}
  	public void setUserStatus(String USER_STATUS) {
		this.USER_STATUS = USER_STATUS;
	}
	
	public String getEmail() {
		return EMAIL;
	}
	public void setEmail(String EMAIL) {
		this.EMAIL = EMAIL;
	}
	
	public String getPhoneNum() {
		return PHONE_NUM;
	}
	public void setPhoneNum(String PHONE_NUM) {
		this.PHONE_NUM = PHONE_NUM;
	}
	
	public LocalDateTime getGccsDt() {
		return AGREE_GCCS_DT;
	}
	public void setGccsDt(LocalDateTime AGREE_GCCS_DT) {
		this.AGREE_GCCS_DT = AGREE_GCCS_DT;
	}
	
	public LocalDateTime getPersonDt() {
		return AGREE_PERSON_DT;
	}
	public void setPersonDt(LocalDateTime AGREE_PERSON_DT) {
		this.AGREE_PERSON_DT = AGREE_PERSON_DT;
	}
	
	public LocalDateTime getDeviceDt() {
		return AGREE_DEVICE_DT;
	}
	public void setDeviceDt(LocalDateTime AGREE_DEVICE_DT) {
		this.AGREE_DEVICE_DT = AGREE_DEVICE_DT;
	}
	
	public String getIcons() {
		return ICONS;
	}
	public void setIcons(String ICONS) {
		this.ICONS = ICONS;
	}
	
//	public int getAuthType() {
//		return AUTH_TYPE;
//	}
//	public void setAuthType(int AUTH_TYPE) {
//		this.AUTH_TYPE = AUTH_TYPE;
//	}
//	
//	public int getPushCount() {
//		return PUSH_COUNT;
//	}
//	public void setPushCount(int PUSH_COUNT) {
//		this.PUSH_COUNT = PUSH_COUNT;
//	}
	
	public LocalDateTime getRegDt() {
		return REG_DT;
	}
	public void setRegDt(LocalDateTime REG_DT) {
		this.REG_DT = REG_DT;
	}
	
	public LocalDateTime getUptDt() {
		return UPT_DT;
	}
	public void setUptDt(LocalDateTime UPT_DT) {
		this.UPT_DT = UPT_DT;
	}
	
}