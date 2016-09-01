package seedu.addressbook.data.person;

/**
 * Represents a Person's address postal code in the address book.
 */

public class PostalCode {

	public final String postalCode;
	
	public PostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
}
