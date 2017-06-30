package weddinginvitation.dao;

import java.util.List;

import weddinginvitation.domain.Danmu;
import weddinginvitation.domain.Guest;

public interface DanmuDao {
	List<Danmu> getDanmu();
	void removeDanmu();
	void addDanmu(Danmu danmu);
	void recordGuest(Guest guest);
}
