package websocketclient.json;

public class User{
   	private String gender;
   	private String name;
   	private String verified;
        private String age;

 	public String getGender(){
		return this.gender;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
 	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
 	public String getAge(){
		return this.age;
	}
	public void setAge(String age){
		this.age = age;
	}
 	public String getVerified(){
		return this.verified;
	}
	public void setVerified(String verified){
		this.verified = verified;
	}
}
