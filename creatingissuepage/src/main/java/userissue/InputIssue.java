package userissue;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class InputIssue {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(nullable=false,unique=true, length =45)
	private String firstname;
	private String descriptions;
	private String imageUrl;
	
	
	public InputIssue(String name, String description, String imageUrl) {
		super();
		this.firstname = name;
		this.descriptions = description;
		this.imageUrl = imageUrl;
	}
	
	public InputIssue() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return firstname;
	}
	public void setName(String name) {
		this.firstname = name;
	}
	public String getDescription() {
		return descriptions;
	}
	public void setDescription(String description) {
		this.descriptions = description;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	
	
	

}
