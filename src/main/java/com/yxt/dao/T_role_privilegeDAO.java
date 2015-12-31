package com.yxt.dao;
import com.sumscope.tag.util.db.activerecord.Model;
import com.sumscope.tag.util.db.activerecord.annotation.PrimaryKey;
import com.sumscope.tag.util.db.activerecord.annotation.Table;
@PrimaryKey("id")
@Table("t_role_privilege")
public class T_role_privilegeDAO extends Model<T_role_privilegeDAO>{
	public static T_role_privilegeDAO dao = new T_role_privilegeDAO();

	public int getId(){
		return (int)get("id");
}
	public T_role_privilegeDAO setId(int v){
		set("id",v);
		return this;
}
	public int getRole_id(){
		return (int)get("role_id");
}
	public T_role_privilegeDAO setRole_id(int v){
		set("role_id",v);
		return this;
}
	public int getPrivilege_id(){
		return (int)get("privilege_id");
}
	public T_role_privilegeDAO setPrivilege_id(int v){
		set("privilege_id",v);
		return this;
}}
