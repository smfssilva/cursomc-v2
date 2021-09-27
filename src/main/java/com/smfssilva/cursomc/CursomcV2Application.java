package com.smfssilva.cursomc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.smfssilva.cursomc.services.S3Service;


@SpringBootApplication
public class CursomcV2Application implements CommandLineRunner {

	@Autowired
	private S3Service s3Service;

	public static void main(String[] args) {
		SpringApplication.run(CursomcV2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		s3Service.uploadFile("/home/silva/Desktop/picture.jpeg");
		
	}

}
