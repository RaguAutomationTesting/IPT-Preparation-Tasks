package org.task;

import java.io.IOException;

import org.base.BaseClass;
import org.facebookobjectrepo.FacebookLoginPojo;
import org.openqa.selenium.WebElement;

public class Question1 extends BaseClass {
	public static void main(String[] args) throws IOException {
		loadBrowser("chrome");

		maximizeBrowser();

		launchUrl("https://www.facebook.com/");

		applyWaitToAllElements();

		FacebookLoginPojo l = new FacebookLoginPojo();
		
		enterText(l.getTxtEmail(), readDataFromExcel(1, 0));
		
		enterText(l.getTxtPass(), readDataFromExcel(1, 1));

		clickElement(l.getBtnLogin());

	}

}
