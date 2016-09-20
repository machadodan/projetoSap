package br.com.projetoSap;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Configuration
@EnableAsync
@EnableScheduling
@EnableJpaRepositories
@EnableTransactionManagement
@ComponentScan(basePackages = {"br.com.projetoSap"})
@EnableAutoConfiguration
@SpringBootApplication
@RestController
public class ProjetoSapApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSapApplication.class, args);
	}
	
	
	@RequestMapping(path="/contatos", method= RequestMethod.GET)
	public List<Contato> listar(){
		
		List<Contato> contatos =  new ArrayList<>();
		Contato c = new Contato();
		c.setNome("Teste");
		contatos.add(c);
		
	  return contatos;
		
 		
		
	}
}
