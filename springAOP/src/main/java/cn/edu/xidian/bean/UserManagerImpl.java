package cn.edu.xidian.bean;

public class UserManagerImpl implements UserManager {
	
	private User user ;
	
	public void addUser() {
		System.out.println("user name : " + user.getName());
		System.out.println("--------------addUser()-----------------");
	}

	public void setUser(User user) {
		this.user = user;
	}

}
