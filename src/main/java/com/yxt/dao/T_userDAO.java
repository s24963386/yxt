package com.yxt.dao;
import com.sumscope.tag.util.db.activerecord.Model;
import com.sumscope.tag.util.db.activerecord.annotation.PrimaryKey;
import com.sumscope.tag.util.db.activerecord.annotation.Table;
@PrimaryKey("id")
@Table("t_user")
public class T_userDAO extends Model<T_userDAO>{
	public static T_userDAO dao = new T_userDAO();

	public String getId(){
		return (String)get("id");
}
	public T_userDAO setId(String v){
		set("id",v);
		return this;
}
	public String getName(){
		return (String)get("name");
}
	public T_userDAO setName(String v){
		set("name",v);
		return this;
}
	public String getUsername(){
		return (String)get("username");
}
	public T_userDAO setUsername(String v){
		set("username",v);
		return this;
}
	public String getPassword(){
		return (String)get("password");
}
	public T_userDAO setPassword(String v){
		set("password",v);
		return this;
}
	public String getTelephone(){
		return (String)get("telephone");
}
	public T_userDAO setTelephone(String v){
		set("telephone",v);
		return this;
}
	public String getMobile(){
		return (String)get("mobile");
}
	public T_userDAO setMobile(String v){
		set("mobile",v);
		return this;
}
	public java.util.Date getCreate_time(){
		return (java.util.Date)get("create_time");
}
	public T_userDAO setCreate_time(java.util.Date v){
		set("create_time",v);
		return this;
}
	public java.sql.Timestamp getUpdate_tiem(){
		return (java.sql.Timestamp)get("update_tiem");
}
	public T_userDAO setUpdate_tiem(java.sql.Timestamp v){
		set("update_tiem",v);
		return this;
}}
