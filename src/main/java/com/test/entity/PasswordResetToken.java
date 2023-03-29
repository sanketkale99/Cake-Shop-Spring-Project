//package com.test.entity;
//
//import java.time.LocalDateTime;
//
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//
//@Entity
//public class PasswordResetToken {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    private String token;
//
//    @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
//    @JoinColumn(nullable = false, name = "user_id")
//    private User user;
//
//    private LocalDateTime expiryDate;
//
//    
//    public PasswordResetToken(int id, String token, User user, LocalDateTime expiryDate) {
//		super();
//		this.id = id;
//		this.token = token;
//		this.user = user;
//		this.expiryDate = expiryDate;
//	}
//
//
//	public PasswordResetToken() {
//    	
//    }
//
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getToken() {
//		return token;
//	}
//
//	public void setToken(String token) {
//		this.token = token;
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//	public LocalDateTime getExpiryDate() {
//		return expiryDate;
//	}
//
//	public void setExpiryDate(LocalDateTime expiryDate) {
//		this.expiryDate = expiryDate;
//	}
//
//    
//}
