package seedu.addressbook.data.person;

public abstract class Contact {
	
	public Contact(){
	}

    public abstract String toString();
    
    public abstract boolean equals(Object other);
    
    public abstract int hashCode();
    
    public abstract boolean isPrivate();
}
