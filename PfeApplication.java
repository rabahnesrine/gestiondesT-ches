package com.example.pfe;

import com.example.pfe.constant.FileConstant;
import com.example.pfe.entites.User;
import com.example.pfe.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.io.File;


@SpringBootApplication
public class PfeApplication implements CommandLineRunner {

@Autowired private UserRepository userRepository;

@Autowired
private RepositoryRestConfiguration restConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(PfeApplication.class, args);
		new File(FileConstant.USER_FOLDER).mkdirs(); //creation deux dossier supportportal et user

	}



	@Override
	public void run(String... args) throws Exception {
/*restConfiguration.exposeIdsFor(User.class);
		//userRepository.save(new User(null,"nesrine","nes@gmail.com",54129042,"developeur","chef","ness12","en attend"));

				userRepository.findAll().forEach(u->{
			System.out.println(u.toString());});
*/
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}
}
