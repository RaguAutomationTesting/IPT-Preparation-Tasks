package org.task;

import java.io.IOException;

import org.adactinobjectrepo.BookHotelPojo;
import org.adactinobjectrepo.LoginPagePojo;
import org.adactinobjectrepo.SearchHotelPagePojo;
import org.base.BaseClass;

public class Question6 extends BaseClass{

	public static void main(String[] args) throws IOException {
		loadBrowser("chrome");
		maximizeBrowser();
		launchUrl("http://www.adactin.com/HotelApp/");
		applyWaitToAllElements();

		LoginPagePojo l =new LoginPagePojo();

		enterText(l.getTxtUsername(), readDataFromExcel(1, 0));
		
		enterText(l.getTxtPassword(), readDataFromExcel(1, 1));

		clickElement(l.getBtnLogin());

		pauseExecution(3000);

		SearchHotelPagePojo s = new SearchHotelPagePojo();

		selectDropDownUsingValue(s.getLocation(), readDataFromExcel(1, 2));

		selectDropDownUsingValue(s.getHotels(), readDataFromExcel(1, 3));

		selectDropDownUsingValue(s.getRoomType(), readDataFromExcel(1, 4));

		selectDropDownUsingValue(s.getAdultRooms(), readDataFromExcel(1, 8));

		selectDropDownUsingValue(s.getChildRooms(), readDataFromExcel(1, 9));

		clickElement(s.getBtnSearch());

		pauseExecution(3000);

		SearchHotelPagePojo s1 = new SearchHotelPagePojo();

		clickElement(s1.getBtnRadio());

		clickElement(s1.getBtnContinue());

		pauseExecution(3000);
		
		BookHotelPojo b = new BookHotelPojo();
		
		enterText(b.getFirstName(), readDataFromExcel(1, 10));
		
		enterText(b.getLastName(), readDataFromExcel(1, 11));
		
		enterText(b.getAddress(), readDataFromExcel(1, 12));
		
		enterText(b.getCreditCardNo(), readDataFromExcel(1, 13));
		
		selectDropDownUsingValue(b.getCreditCardType(), readDataFromExcel(1, 14));
		
		selectDropDownUsingValue(b.getCreditCardMonth(), readDataFromExcel(1, 15));
		
		selectDropDownUsingValue(b.getCreditCardYear(), readDataFromExcel(1, 16));
		
		enterText(b.getCcvNo(), readDataFromExcel(1, 17));
		
		clickElement(b.getBtnBookNow());
		
		System.out.println(getAttributeValueOfWebelement(b.getOrderNo()));
		
		updationInExcel(getAttributeValueOfWebelement(b.getOrderNo()));
		updationInExcel(rowNo, cellNo, data);

	}

}
