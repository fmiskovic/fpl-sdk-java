package goat.fpl.api;

import java.util.Optional;

public interface PlayerService {

    Optional<String> getPlayersData() throws Exception;

    Optional<String> getSpecificPlayerData(long playerId) throws Exception;
}
