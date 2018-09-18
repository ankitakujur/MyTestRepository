package com.pojo;

import exercises.Cat;
import exercises.Dog;

public class Implement implements Cat, Dog {
	@Override
	public void favfood() {
		Cat.super.favfood();
		Dog.super.favfood();
	}

}
