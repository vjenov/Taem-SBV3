package com.taem.web.enums;

public enum Path {
	UPLOAD_PATH, CRAWLING_TARGET;
	public String toString() {
		String result = "";
		switch(this) {
		case UPLOAD_PATH :
			result = "C:\\Users\\user\\maplace\\springboot-vue\\TAEM-SBV-3\\src\\main\\webapp\\resources\\upload";
			break;
		}
		return result;
	}
}
