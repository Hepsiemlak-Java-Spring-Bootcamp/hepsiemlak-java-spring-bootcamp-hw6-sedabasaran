package Service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import emlakburada.service.EmailService;
import emlakburada.service.RabbitMqListenerService;

@SpringBootTest
class RabbitMqListenerServiceTest {
	
	@InjectMocks
	private RabbitMqListenerService rabbitMqListenerService;
	
	@Mock
	private EmailService emailService;
	
	@Test
	void receiveMessage() {
		
		emailService.send("seda@gmail.com");
	}

}
