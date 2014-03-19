package banking.primitive.core;

/*
    File: AccountServer.java
    Author: Dr. Gary
    Date: 3/19/2014

    Description: Interface class for ServerSolution.java. Can create an account, delete an account, and retrieve list of accounts.

*/

import java.io.IOException;
import java.util.List;

public interface AccountServer {	
	/**
	 * @param name name of the account 
	 * @return Account object or null if not found. 
	 */
	public Account	getAccount(String name);

	/** 
	 * @return a list of all Accounts inside the server 
	 */
	public List<Account> getAllAccounts();

	/** 
	 * @return a list of Accounts inside the server that are not CLOSED
	 */
	public List<Account> getActiveAccounts();

	/** 
	 * Saves the state of the server
	 * @throws IOException if unable to save the state
	 */
	/** 
	 *  Create a new account object in the server. if an account already exists with the given name
	 *  then a new account is not created and stored.
	 *  
		@param type must be one of Savings or Checking
		@param name leading or trailing whitespace is removed
		@param balance must be non-negative
		@throws IllegalArgumentException if the account type is invalid or the balance is non-negative.
		@return boolean true if the account was created and stored, false otherwise
	*/
	public boolean	newAccount(String type, String name, float balance) throws IllegalArgumentException;

	/** Close an account 
		@param name leading or trailing whitespace is removed
	 * @return boolean true if there was an account with this name and close was successful
	*/
	public boolean	closeAccount(String name);

	public void	saveAccounts() throws IOException;
}
