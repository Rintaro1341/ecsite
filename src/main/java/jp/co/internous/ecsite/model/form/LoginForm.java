package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

//フォームから送られてきたデータを格納するクラス
public class LoginForm implements Serializable {
	
//	フォームから送られてきたデータを格納するフィールド
	private String userName;
	private String password;
	
//	各フィールドのgetter,setterメソッド
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
