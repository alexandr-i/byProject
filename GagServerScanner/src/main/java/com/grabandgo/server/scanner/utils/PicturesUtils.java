/**
 * 
 */
package com.grabandgo.server.scanner.utils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;

import com.grabandgo.server.commons.utils.FilesUtils;

/**
 * @author Alexandr_I
 *
 */
public class PicturesUtils {
	
	private static final Logger LOG = LoggerFactory.getLogger(PicturesUtils.class);

	public static String getRandomPicture() {
		String theResult = "";
		try {
			File file = new ClassPathResource("/static/images").getFile();
			if (file.isDirectory()) {
				List<File> files = Arrays.stream(file.listFiles()).filter(f -> f.isFile()).collect(Collectors.toList());
				Random r = new Random();
				theResult = files.get(r.nextInt(files.size())).getPath();
				theResult = "http://localhost:8080/" + theResult.substring(theResult.indexOf(FilesUtils.STATIC_WITH_SEPS) + FilesUtils.STATIC_WITH_SEPS.length()).replaceAll("\\", "/");//TODO get gost for images by pros or otherrwhise
				
			}
		} catch (IOException e) {
			LOG.warn("Cannot find images folder: ", e);
		}
		return theResult;
	}
	
}
