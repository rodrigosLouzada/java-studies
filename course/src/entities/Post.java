package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private Date momentDate;
	private String title;
	private String content;
	private Integer likes;
	List<Comment> comments = new ArrayList<Comment>();
	
	public Post() {
		
	}

	public Post(Date momentDate, String title, String content, Integer likes) {
		this.momentDate = momentDate;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMomentDate() {
		return momentDate;
	}

	public void setMomentDate(Date momentDate) {
		this.momentDate = momentDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		
		comments.remove(comment);
	}
}
