package EnumConcept;

public enum Environment {

	QA("qa"),
	STAGE("Amazonstage"),
	DEV("dev"),
	UAT("uat"),
	PROD("prod");
	
	String envName;
	
	Environment(String envName){
		this.envName = envName;
		
	}
	public String getEnvValue() {
		return this.envName;
		
	}
}
