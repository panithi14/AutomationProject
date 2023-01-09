package SeleniumSessions;

public class CustomXpath {

	/*
	 * xpath is an locator not an attribute xpath is address of element two types of
	 * xpaths absolute xpath :we should never use absolute xpath relative xpath : we
	 * always prefer relative xpath
	 */

	// htmltag[@attribute='value']
	// input[@id='input-email']
	// input[@name='email']
	// input[@type='text']
	// *[@id='input-text'] suppose if we have 500 elements on the page it will
	// verify all the elements with ID tag
	// so we should not use this *

	/* multiple attributes */

	// htmltag[@attribute1='value' and @attribute2='value']
	// input[@id='input-email' and @name='email']
	// input[@type='text' and @name='email' and @id]
	// input[@type='text' and @name and @id]
	// input[@type and @name and @id]

	// index of xpath or positioning of xpath
	// (//input[@type='text'])[1]
	// (//input[@type='text'])[position()=1]
	// By.xpath("(//input[@type='text'])[1]");

	// last function this function is pointing to the last element from the list
	// (//input[@class='form-control'])[last()]

	// we can do reverse also by using -1,-2,-3 etc...
	// (//input[@class='form-control'])[last()-1]

	// we do not have first function

	// contains function

	// htmltag[contains(@id,'value')]

	// input[contains(@id,'input-email')]

	// htmltag[contains(@attr1,'value') and @attr2='value]
	// input[contains(@id,'email') and @name='email' and
	// contains(@placeholder,'E-Mail')]
	// input[contains(@id,'email') and contains(@placeholder,'E-Mail')]

	// input[contains(@id,'input-email') and @name='email']

	// text(): links, labels, span, div, header
	// htmltag[text()='value']

	// h2[text()='Delight your customers']
	// a[text()='Recurring payments']
	// h3[text()='Import & Export']
	// (//a[text()='Forgotten Password'])[position()=2

	// if text is dynamic in nature

	// contains() with text()

	// h5[contains(text(),'Fresh')]

	// htmltag[contains(text(),'value') and @attribute='value']

	// a[contains(text(),'Login') and @class='list-group-item']

	// contains() with text() and attr:
	// htmltag[contains(text(),'value') and @attr='value']
	// a[contains(text(),'Login') and @class='list-group-item']
	// a[contains(text(),'Login') and @class='list-group-item' and
	// contains(@href,'account/login')]

	// diff b/w contains and starts-with

	// contains means it can contain anywhere in DOM
	// starts with means it should start with particular value

	// ends-with is not supporting currently
	// form-control private-form__control login-email
	// By.xpath("//input[@class='form-control private-form__control
	// login-email']");//right
	// By.className("form-control private-form__control login-email");//wrong
	// By.className("login-email");//right
	// By.cssSelector(".form-control.private-form__control.login-email");//right
	// .c1.c2.c3.c4.....c100
	// by.classname is always expect unique class name we can not create three
	// classes together.it will not work
	// in xpath and css selector we can take multiple classes together

	// Parent and child sibling concepts

	// from parent to direct child

	// div[@class='mb-3']/input[@name='email']---direct child
	// div[@class='mb-3']//input[@name='email']---direct and indirect child
	// div[@class='mb-3']/child::input[@name='email']...direct child
	// div[@class='mb-3']//child::input[@name='email']....direct and indirect child

	// we can use single slash nd double slash also

	// we can backward direction also in css we can not go
	//
	// input[@name='email']/..

	// child to parent:
	// input[@name='email']/../../../../../../../../../..
	// input[@name='email']/..
	// input[@name='email']/parent::div

	// input[@name='email']/parent::div/parent::form
	// input[@name='email']/../parent::form

	// we will get all the parent and grand parent tags
	// input[@type='text']/ancestor::div(any tag)

	// preceding sibling
	// input[@type='text']/preceding-sibling::label

	// child to child via parent
	// label[@for='input-email']/../child::input
	// label[@for='input-email']/../input ..without using child and parent keywords
	// label[@for='input-email']/parent::div/child::input..using child and parent
	// keywords

	// webTable examples
	// a[text()='Harshitha
	// Deepak']/parent::td/preceding-sibling::td/input[@type='checkbox']
	// a[text()='Indra
	// Nanj']/parent::td/preceding-sibling::td/input[@type='checkbox']

	// SVG Elements
	// Shadow-Dom
	// Pesudo Elements -- :: before and ::after

	// a[text()='Indra Nanj']/parent::td/following-sibling::td/a[@context='company']

}
