package emlakburada.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emlakburada.dto.request.BannerRequest;
import emlakburada.dto.response.BannerResponse;
import emlakburada.model.Banner;
import emlakburada.repository.BannerRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BannerService extends BannerBaseService{

	@Autowired
	private BannerRepository repository;

	public List<BannerResponse> getAllBanners() {
		List<BannerResponse> bannerResponses = new ArrayList<>();
		for (Banner banner : repository.findAllBanners()) {
			bannerResponses.add(convertToBannerResponse(banner));
		}
		return bannerResponses;
	}

	
	public void saveBanner(BannerRequest request) {
		repository.saveBanner(convertToBanner(request));
	}

//	public BannerResponse saveBanner(BannerRequest request) {
//		Banner banner = repository.saveBanner(convertToBanner(request));
//		return convertToBannerResponse(banner);
//	}
//

}
