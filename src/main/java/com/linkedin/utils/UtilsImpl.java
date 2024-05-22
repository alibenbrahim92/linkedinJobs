package com.linkedin.utils;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Component;

@Component
public class UtilsImpl implements Utils{

	@Override
	public String mapToString(Map<String, String> fromMap) {
		String[] keyElements;
		String link;
		StringBuilder result = new StringBuilder();
		for(Entry<String, String> entry : fromMap.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			link = value.split(";;;")[1].trim();
			keyElements = key.split(";;;");
			String role = keyElements[0].trim();
			String companyName = keyElements[1].trim();
			result.append("*** Role : ").append(role).append(" ***\n");
			result.append("- Company : ").append(companyName).append("\n");
			result.append("- Link : ").append(link).append("\n");
			result.append("****************************\n");
		}
		return result.toString();
	}
	
}