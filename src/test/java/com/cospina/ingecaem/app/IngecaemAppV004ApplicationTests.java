package com.cospina.ingecaem.app;

import com.cospina.ingecaem.app.models.documents.register.Task;
import com.cospina.ingecaem.app.models.services.register.TaskService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import static com.cospina.ingecaem.app.Data.createTask001;
import static org.mockito.Mockito.*;

@SpringBootTest
class IngecaemAppV004ApplicationTests {
	@MockBean
	private TaskService taskService;

	@Test
	void contextLoads() {
	}

	@Test
	void testFindAll() {
		// Given
		Flux<Task> data = Flux.just(createTask001().orElseThrow());
		when(taskService.findAll()).thenReturn(data);

		// When
		Flux<Task> tasks = taskService.findAll();

		// Then
		StepVerifier.create(data).expectSubscription().verifyComplete();
	}
}
