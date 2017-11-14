/**
 * 
 */
package com.grabandgo.server.commons.utils;

import java.nio.file.FileSystems;

/**
 * @author Alexandr_I
 *
 */
public class FilesUtils {

	public static final String SEP = FileSystems.getDefault().getSeparator();
	public static final String STATIC_WITH_SEPS = SEP + "static" + SEP;
	
}
