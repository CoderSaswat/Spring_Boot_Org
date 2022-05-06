package com.saswat.springboot.springbatch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class Writer implements ItemWriter<String> {

	@Override
	public void write(List<? extends String> items) throws Exception {
		System.out.println("inside writer method");
		System.out.println("Writing data : " + items);
	}

}
