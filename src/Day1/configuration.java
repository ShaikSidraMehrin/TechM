package Day1;

public final class configuration {
	private final String dbUrl;
	private final String admin;
	private final String pass;
	public configuration(String dbUrl,String admin,String pass){
		this.dbUrl=dbUrl;
		this.admin=admin;
		this.pass=pass;
		
	}
	public String getdbUrl() {
		return dbUrl;
	}
	public String getadmin() {
		return admin;
	}
	public String pass() {
		return pass;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		configuration c=new configuration("jdbc:mysql://localhost", "admin", "password123");
				System.out.println(c.getdbUrl());
				System.out.println(c.getadmin());
			

	}

}