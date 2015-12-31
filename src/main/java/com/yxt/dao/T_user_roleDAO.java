package com.yxt.dao;
import com.sumscope.tag.util.db.activerecord.Model;
import com.sumscope.tag.util.db.activerecord.annotation.PrimaryKey;
import com.sumscope.tag.util.db.activerecord.annotation.Table;
@PrimaryKey("id")
@Table("t_user_role")
public class T_user_roleDAO extends Model<T_user_roleDAO>{
	public static T_user_roleDAO dao = new T_user_roleDAO();

	public int getId(){
		return (int)get("id");
}
	public T_user_roleDAO setId(int v){
		set("id",v);
		return this;
}
	public String getUsername(){
		return (String)get("username");
}
	public T_user_roleDAO setUsername(String v){
		set("username",v);
		return this;
}
	public int getRole_id(){
		return (int)get("role_id");
}
	public T_user_roleDAO setRole_id(int v){
		set("role_id",v);
		return this;
}}
