package com.example.LK_TL;

import com.example.LK_TL.node.node;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
/*@RestController*/
public class LkTlApplication {

	public static void main(String[] args) {
		SpringApplication.run(LkTlApplication.class, args);
	}
}
	/*@GetMapping
	public String hello1() {
		return "Hello World";
	}

	public List<node> hello() {
		return List.of(
				new node(
						"T300_001",
						"Node1",
						"sample text",
						"sample text",
						"Transponder",
						"SubgroupNE_1",
						"sample text",
						"sample text"

				)
		);
	}

}*/
