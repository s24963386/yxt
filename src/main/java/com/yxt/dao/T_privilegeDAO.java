package com.yxt.dao;
import com.sumscope.tag.util.db.activerecord.Model;
import com.sumscope.tag.util.db.activerecord.annotation.PrimaryKey;
import com.sumscope.tag.util.db.activerecord.annotation.Table;
@PrimaryKey("id")
@Table("t_privilege")
public class T_privilegeDAO extends Model<T_privilegeDAO>{
	public static T_privilegeDAO dao = new T_privilegeDAO();

	public int getId(){
		return (int)get("id");
}
	public T_privilegeDAO setId(int v){
		set("id",v);
		return this;
}
	public String getName(){
		return (String)get("name");
}
	public T_privilegeDAO setName(String v){
		set("name",v);
		return this;
}
	public String getResource(){
		return (String)get("resource");
}
	public T_privilegeDAO setResource(String v){
		set("resource",v);
		return this;
}
	public String getDescription(){
		return (String)get("description");
}
	public T_privilegeDAO setDescription(String v){
		set("description",v);
		return this;
}
	public int getSort(){
		return (int)get("sort");
}
	public T_privilegeDAO setSort(int v){
		set("sort",v);
		return this;
}}
