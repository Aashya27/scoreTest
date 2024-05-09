package test.mobile.score_qa_automation_challenge.base;


/**
 * @author aashya.bodugula
 * @since 9 May 2024 Description : This file is to keep the constants in the form of enums
 */


public class Constants {

	  public enum DevicePlatform {
		  
			ANDROID("android"), IOS("ios");
			private final String name;
		  
			DevicePlatform(String name) {
				this.name = name;
			}

			public String getName() {
				return this.name;
			}
	  }
}
