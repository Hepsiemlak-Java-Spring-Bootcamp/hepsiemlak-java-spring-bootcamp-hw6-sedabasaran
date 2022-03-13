package emlakburada.dto.response;

import java.util.Date;

import emlakburada.model.User;

public class MessageResponse {
	private int id;
	private String baslik;
	private String icerigi;
	private Date gonderilenTarih;
	private Date okunduguTarihi;
	private boolean gorulduMu;
	private User gonderici;
	private User alici;
}
