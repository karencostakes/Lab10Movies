package MovieClasses;

import java.util.ArrayList;

public class Movies {

	private String title;
	private String category;
	// ArrayList <String> animatedTitles = new ArrayList <> ();
	

	// ArrayList <String> dramaTitles = new ArrayList <> ();

	// ArrayList <String> horrorTitles = new ArrayList <> ();
	// ArrayList <String> scifiTitles = new ArrayList <> ();

	public String getTitle() {

		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
	System.out.println("hello!");
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}

	public Movies(String title, String category) {
		this.title = title;
		this.category = category;
	}

}