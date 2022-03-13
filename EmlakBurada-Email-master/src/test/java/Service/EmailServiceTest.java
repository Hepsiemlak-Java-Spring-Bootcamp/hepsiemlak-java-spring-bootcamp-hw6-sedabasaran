package Service;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import javax.mail.MessagingException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import emlakburada.config.EmailConfig;
import emlakburada.service.EmailService;

@SpringBootTest
class EmailServiceTest {
	
	@InjectMocks
	private EmailService emailService;
	
	
	@Mock
	private EmailConfig config;
	
	@BeforeEach
	void setup() {
		Mockito.when(config.getSmtpServer()).thenReturn("smtp.gmail.com");
		Mockito.when(config.getSmtpPort()).thenReturn("587");
		Mockito.when(config.getFrom()).thenReturn("emlakburada.patika@gmail.com");
		Mockito.when(config.getUsername()).thenReturn("patika@patika.com");
		Mockito.when(config.getPassword()).thenReturn("EmlakBurada2022");
	}
	

	@Test
	void it_should_throw_exception() {
		
		assertThrows(MessagingException.class, () -> {
			emailService.send("seda@gmail.com");
		});		
	}
	
	@Test
	void it_should_save() {
		
		assertDoesNotThrow(() -> {
			emailService.send("seda@gmail.com");

		});
		
	}
}
