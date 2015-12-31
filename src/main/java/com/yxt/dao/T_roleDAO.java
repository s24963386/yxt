package com.yxt.dao;
import com.sumscope.tag.util.db.activerecord.Model;
import com.sumscope.tag.util.db.activerecord.annotation.PrimaryKey;
import com.sumscope.tag.util.db.activerecord.annotation.Table;
@PrimaryKey("id")
@Table("t_role")
public class T_roleDAO extends Model<T_roleDAO>{
	public static T_roleDAO dao = new T_roleDAO();

	public int getId(){
		return (int)get("id");
}
	public T_roleDAO setId(int v){
		set("id",v);
		return this;
}
	public String getName(){
		return (String)get("name");
}
	public T_roleDAO setName(String v){
		set("name",v);
		return this;
}
	public String getDescription(){
		return (String)get("description");
}
	public T_roleDAO setDescription(String v){
		set("description",v);
		return this;
}
	public int getSort(){
		return (int)get("sort");
}
	public T_roleDAO setSort(int v){
		set("sort",v);
		return this;
}}
