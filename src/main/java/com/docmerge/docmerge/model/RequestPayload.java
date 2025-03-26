package com.docmerge.docmerge.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestPayload {
	
	private String documentCount;
	private String baseFileLocation;
	private String docType;
	private String saveAsFileName;
	private String saveResultLocation;
	private AppendFromFileLocation appendFromFileLocation;

}
