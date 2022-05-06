package com.saswat.springboot.springbatch;

import javax.batch.api.listener.JobListener;

public class MyJobListener implements JobListener {

	@Override
	public void beforeJob() throws Exception {
		System.out.println("job started");
	}

	@Override
	public void afterJob() throws Exception {
		System.out.println("job ended");
	}

}
