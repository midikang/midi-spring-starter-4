package com.midi.spring.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DummyController {
	private static Logger log = LoggerFactory.getLogger(DummyController.class);
	public String helloMVC() {
		return "dummy";
	}
}
