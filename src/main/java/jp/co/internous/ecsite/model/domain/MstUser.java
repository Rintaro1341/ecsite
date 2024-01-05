package jp.co.internous.ecsite.model.domain;
//MstUserはdomain(entity)クラス
//テーブルの1レコードの実体として機能するクラス
public class MstUser {
	
//	MstUserテーブルの各カラムを格納するフィールドを定義
	private int id;
	private String userName;	
	private String password;
	private String fullName;
	private int isAdmin;
	
//	各フィールドのsetter,getter,メソッドを定義
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassowrd(String password) {
		this.password = password;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public int getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	
}
