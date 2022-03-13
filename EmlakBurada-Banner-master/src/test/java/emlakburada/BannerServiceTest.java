package emlakburada;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import emlakburada.dto.request.BannerRequest;
import emlakburada.dto.response.BannerResponse;
import emlakburada.model.Banner;
import emlakburada.repository.BannerRepository;
import emlakburada.service.BannerService;

@SpringBootTest
class BannerServiceTest {
	
	@InjectMocks
	private BannerService bannerService;
	
	@Mock
	private BannerRepository repository;
	
	@BeforeEach
	void setup() {
	
		//// @formatter:off
		Mockito
		.when(repository.findAllBanners())
		.thenReturn(prepareMockBannerList());		
		// @formatter:on
	}

	private List<Banner> prepareMockBannerList() {
		List<Banner> bannerList = new ArrayList<Banner>() ;
		bannerList.add(new Banner(1, "555", 7500, null));
		bannerList.add(new Banner(2,"535",3500, null));
		return bannerList;
	}
		
	@Test
	void getAllBannersTest() {		
		List<BannerResponse> allBanner = bannerService.getAllBanners();		
		assertNotNull(allBanner);			
		assertThat(allBanner.size()).isNotZero();
	}
	
	@Test
	void saveBannerTest() {		
		bannerService.saveBanner(prepareBanner());		
		Mockito.verify(repository).saveBanner(any());

	}

	private BannerRequest prepareBanner() {
		return new BannerRequest(1, "555", 0, null);

		 
	}
	
	

}
