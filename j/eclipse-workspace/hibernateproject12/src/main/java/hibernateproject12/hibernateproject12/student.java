package hibernateproject12.hibernateproject12;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class student {
	@Id
	@Column(name="id")
 private int id;
	@Column(name="name")
 private String name;
	@Column(name="dept")
	private String dept;
	@Column(name="sec")
	private String sec;
	
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getSec() {
	return sec;
}
public void setSec(String sec) {
	this.sec = sec;
}
}
