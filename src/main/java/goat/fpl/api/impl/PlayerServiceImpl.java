package goat.fpl.api.impl;

import java.util.Optional;

import goat.fpl.api.PlayerService;
import goat.fpl.config.URLS;

public class PlayerServiceImpl extends BaseService implements PlayerService {

    public Optional<String> getPlayersData() throws Exception {
	return Optional.of(httpGetDataAsString(URLS.MAIN));
    }

    @Override
    public Optional<String> getSpecificPlayerData(long playerId) throws Exception {
	return Optional.of(httpGetDataAsString(String.format(URLS.PLAYER_SUM, playerId)));
    }
}
