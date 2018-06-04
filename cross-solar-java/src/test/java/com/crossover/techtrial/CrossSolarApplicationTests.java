package com.crossover.techtrial;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.crossover.techtrial.controller.PanelController;
import com.crossover.techtrial.model.Panel;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrossSolarApplicationTests {

	@Autowired
    private PanelController panelController;
	
	
	@Test
	public void contextLoads() throws Exception{
		assertThat(panelController).isNotNull();
	}

}
