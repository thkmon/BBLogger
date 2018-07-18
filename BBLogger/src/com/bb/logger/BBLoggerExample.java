package com.bb.logger;

public class BBLoggerExample {

	public static BBLogger logger = null;
	
	
	public static void main(String[] args) {
		BBLoggerExample exampleObj = new BBLoggerExample();
		exampleObj.test();
	}
	
	
	public void test() {
		logger = new BBLogger("log", "test");
		
		logger.debug("test1");
		
		logger.info("test1");
		
		logger.error("test1");
		
		try {
			
			int x = 1 / 0;
			
		} catch (Exception e) {
			logger.error(e);
		}
	}
}
