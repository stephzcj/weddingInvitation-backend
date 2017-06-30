package weddinginvitation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import weddinginvitation.dao.DanmuDao;
import weddinginvitation.domain.Danmu;
import weddinginvitation.domain.Guest;
@Service
public class DanmuService {
	@Autowired
	DanmuDao danmuDao;
	public List<Danmu> getDanmu(){
		return danmuDao.getDanmu();
	}
	public void addDanmu(Danmu danmu){
		danmuDao.addDanmu(danmu);
	}
	public void removeDanmu(String id){
		
	}
	public void recordGuest(Guest guest){
		danmuDao.recordGuest(guest);
	}
}
