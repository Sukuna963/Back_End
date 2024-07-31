package com.example.demo;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(TestController.class)
public class TestControllerSymflowerTest {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void getInt1() throws Exception {
		this.mockMvc.perform(get("/test"))
			.andExpect(status().isOk())
			.andExpect(content().contentType(MediaType.TEXT_PLAIN_VALUE + "; charset=UTF-8"))
			.andExpect(content().string("hello world"));
	}
}
