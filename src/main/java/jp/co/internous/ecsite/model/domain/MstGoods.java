package jp.co.internous.ecsite.model.domain;

import java.sql.Timestamp;

//MstUserクラスと同じ
public class MstGoods {
	
//	各カラムを格納するフィールドを定義
	private int id;
	private String goodsName;
	private int price;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
//	各フィールドのgetter,setterメソッドを定義
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
}
