package com.qa.opencart.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constants {
	public static final int DEFAULT_TIME_OUT = 5;
	public static final String LOGIN_PAGE_TITLE = "Account Login";
	public static final CharSequence LOGIN_PAGE_URL_VALUE = "account/login";
	public static final String ACCOUNT_PAGE_TITLE = "My Account";
	public static final List<String> EXE_ACCOUNTS_SEC_LIST = new ArrayList<String>(
			Arrays.asList("My Account", "My Orders"));
	public static final int IMAGE_COUNT = 3;
	public static final String REGISTER_SUCCESS_MESSAGE = "Your Account Has Been Created";
	public static final String REGISTER_SHEET_NAME = "register";

	public static final String PRODUCTS_SHEET_NAME = "products";
}
