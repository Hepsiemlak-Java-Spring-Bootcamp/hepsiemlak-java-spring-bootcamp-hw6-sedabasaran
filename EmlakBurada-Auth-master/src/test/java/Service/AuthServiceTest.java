package Service;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import emlakburada.dto.AuthRequest;
import emlakburada.entity.User;
import emlakburada.entity.enums.UserType;
import emlakburada.repository.AuthRepository;
import emlakburada.service.AuthService;
import emlakburada.util.JwtUtil;

@SpringBootTest
public class AuthServiceTest {

	@InjectMocks
	AuthService authService;
	
	@Mock
	private AuthRepository authRepository;
	
	@Mock
	private JwtUtil jwtUtil;
	
	@Test()
	@DisplayName("when user not found with email throw exception. "
			+ "method name can be: should_throw_exception_when_user_not_found_email")
	void findByEmailWithoutUserTest() {
		
		assertThrows(Exception.class, () -> {
			authService.getToken(prepareAuthRequest());
		}, "kullanıcı email bulunamadı");

	}
	
	@Test()
	void findByEmailWithUserTest() throws Exception {
		AuthRequest request = prepareAuthRequest();
		
		Optional<User> user = Optional.of(prepareUser());
		
		Mockito
		.when(authRepository.findByEmail(request.getEmail()))
		.thenReturn(user);		
		
	}
	
	@Test()
	@DisplayName("when user not found with password throw exception. "
			+ "method name can be: should_throw_exception_when_user_not_found_email_password")
	void isValidPasswordWithoutUserPasswordTest() {
		
		assertThrows(Exception.class, () -> {
			authService.getToken(prepareAuthRequest());
		}, "kullanıcı password bulunamadı");

	}

	@Test()
	void isValidPasswordWithUserPasswordTest() throws Exception {
		AuthRequest request = prepareAuthRequest();
		
		Optional<User> user = Optional.of(prepareUser());
		
		Mockito
		.when(authRepository.findByEmail(request.getPassword()))
		.thenReturn(user);
		
	}
	
	
	private User prepareUser() {
		User user = new User(UserType.CORPORATE, "email", 12345);
		return user;		
	}

	private AuthRequest prepareAuthRequest() {
		AuthRequest request = new AuthRequest(null, null);
		request.setEmail(null);
		request.setPassword(null);
		return request;
	}
	
		
	
}
