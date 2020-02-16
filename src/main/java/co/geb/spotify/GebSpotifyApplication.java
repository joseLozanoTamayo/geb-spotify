package co.geb.spotify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class GebSpotifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(GebSpotifyApplication.class, args);
	}

}
