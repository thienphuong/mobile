package com.linecorp.model;

public class UserAccount {

	private String email;
	private String password;
	private String OTP;

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public UserAccount(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public UserAccount(String email, String password, String OTP) {
		this.email = email;
		this.password = password;
		this.OTP = OTP;
	}

	@Override
	public String toString() {
		return "E-Mail: " + getEmail() + ", Password: " + getPassword();
	}

	public static class UserAccountBuilder {

		private String email = "";
		private String password = "";
		private String OTP = "";

		public UserAccountBuilder() {
		}

		public UserAccountBuilder withEmail(String email) {
			this.email = email;
			return this;
		}

		public UserAccountBuilder withPassword(String password) {
			this.password = password;
			return this;
		}

		public UserAccountBuilder usingOTP(String OTP) {
			this.OTP = OTP;
			return this;

		}

		public UserAccount build() {
			if ("".equals(OTP) || OTP.isEmpty())
				return new UserAccount(email, password);
			else
				return new UserAccount(email, password, OTP);
		}

	}
}
