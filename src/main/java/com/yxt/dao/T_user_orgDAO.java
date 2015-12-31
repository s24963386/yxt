package com.yxt.dao;
import com.sumscope.tag.util.db.activerecord.Model;
import com.sumscope.tag.util.db.activerecord.annotation.PrimaryKey;
import com.sumscope.tag.util.db.activerecord.annotation.Table;
@PrimaryKey("id")
@Table("t_user_org")
public class T_user_orgDAO extends Model<T_user_orgDAO>{
	public static T_user_orgDAO dao = new T_user_orgDAO();

	public int getId(){
		return (int)get("id");
}
	public T_user_orgDAO setId(int v){
		set("id",v);
		return this;
}
	public String getUsername(){
		return (String)get("username");
}
	public T_user_orgDAO setUsername(String v){
		set("username",v);
		return this;
}
	public int getOrg_id(){
		return (int)get("org_id");
}
	public T_user_orgDAO setOrg_id(int v){
		set("org_id",v);
		return this;
}}
