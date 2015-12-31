package com.yxt.dao;
import com.sumscope.tag.util.db.activerecord.Model;
import com.sumscope.tag.util.db.activerecord.annotation.PrimaryKey;
import com.sumscope.tag.util.db.activerecord.annotation.Table;
@PrimaryKey("id")
@Table("t_org")
public class T_orgDAO extends Model<T_orgDAO>{
	public static T_orgDAO dao = new T_orgDAO();

	public int getId(){
		return (int)get("id");
}
	public T_orgDAO setId(int v){
		set("id",v);
		return this;
}
	public String getName(){
		return (String)get("name");
}
	public T_orgDAO setName(String v){
		set("name",v);
		return this;
}
	public String getDescription(){
		return (String)get("description");
}
	public T_orgDAO setDescription(String v){
		set("description",v);
		return this;
}
	public int getSort(){
		return (int)get("sort");
}
	public T_orgDAO setSort(int v){
		set("sort",v);
		return this;
}}
