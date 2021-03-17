/**
 * 
 */
package com.playground.spring.di.datasource;

/**
 * @author bubaibal
 *
 */
public class SpringDataSource {
	
	private String username;
	private String password;
	private String jdbcUrl;
	/**
	 * @param username
	 * @param password
	 * @param jdbcUrl
	 */
	public SpringDataSource(String username, String password, String jdbcUrl) {
		this.username = username;
		this.password = password;
		this.jdbcUrl = jdbcUrl;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the jdbcUrl
	 */
	public String getJdbcUrl() {
		return jdbcUrl;
	}
	/**
	 * @param jdbcUrl the jdbcUrl to set
	 */
	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}
	@Override
	public String toString() {
		return "SpringDataSource [username=" + username + ", password=" + password + ", jdbcUrl=" + jdbcUrl + "]";
	}

}
