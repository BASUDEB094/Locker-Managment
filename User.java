package lock.locker.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "USER_NAME")
	private String user_Name;
	@Column(name = "AGE")
	private long age;
	@Column(name = "LOCATION")
	private String location;
	
	@CreationTimestamp
	@Column(name = "created_at",nullable = false,updatable =false)
	private Date createdAt;
	@UpdateTimestamp
	@Column(name = "updated_at")
	private Date updatedAt;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "lockerid")
	private Locker locker;
	
	

}
