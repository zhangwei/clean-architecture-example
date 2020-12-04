package com.slalom.example.domain.port;

/**
 * The interface Password encoder.
 * @author zhangwei
 */
public interface PasswordEncoder {

	/**
	 * Encode string.
	 *
	 * @param str the str
	 * @return the string
	 */
	String encode(String str);
}
