package application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import applicattion.dao.Animal;

@RestController
@RequestMapping(value="/animais")
public class AnimaisController {
	private static final List<Animal> animais = new ArrayList<>();
	
	
	@RequestMapping(value="/lista", method = RequestMethod.GET)
	public List<Animal> retornaAnimais(){
		return animais;
	}
	
	@RequestMapping(value="/novo", method = RequestMethod.POST)
	public String gravaAnimais(@RequestBody(required=true) String nome){
		animais.add(new Animal(System.currentTimeMillis(), nome));
		return "Novo animal: " + nome;
	}
}
