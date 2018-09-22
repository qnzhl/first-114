package com.zgs.server0826;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApp {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String server=scan.nextLine();
		new SpringApplicationBuilder(EurekaServerApp.class).profiles(server).run(args);
	}

}
