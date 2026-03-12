package cn.wangruiping.tour.business;

import cn.wangruiping.tour.db.service.UserSpotCheckinsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author wrp
 * @since 2026年03月12日 9:06
 **/
@Service
@RequiredArgsConstructor
public class UserSpotCheckinsBusiness {

    private final UserSpotCheckinsService userSpotCheckinsService;

    public void checkins(Long spotId) {
    }
}
