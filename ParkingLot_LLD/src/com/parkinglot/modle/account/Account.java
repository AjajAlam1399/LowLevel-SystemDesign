package com.parkinglot.modle.account;

import java.time.LocalDateTime;

public abstract class Account {
	private String id;
	private String userName;
	private String email;
	private String password;
	private LocalDateTime lastAcessed;
	private Contact contact;
}
