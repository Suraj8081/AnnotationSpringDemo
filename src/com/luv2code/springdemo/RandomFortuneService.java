package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	
	private String[] data= {
			"Sleeping Every time",
			"Today you get reward",
			"Your mother said good luck"
	};
	
	
	Random random=new Random();
	
	@Override
	public String getFortune() {
		int index=random.nextInt(data.length);
		
		String fortune=data[index];
		
		return fortune;
	}

}
