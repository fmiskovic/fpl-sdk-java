package goat.fpl.api.tests;

import java.util.List;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import goat.fpl.api.PlayerService;
import goat.fpl.api.impl.JsonUtils;
import goat.fpl.api.impl.PlayerServiceImpl;
import goat.fpl.domain.player.Player;
import goat.fpl.domain.player.PlayerHolder;

public class PlayerServiceTest {

    private static final long PLAYER_ID = 104l; // eden hazard

    private PlayerService playerService;

    @Test
    public void getPlayersDataTest() throws Exception {
	Optional<String> op = getPlayerService().getPlayersData();
	Assert.assertTrue(op.isPresent());

	PlayerHolder playerHolder = JsonUtils.readValue(op.get(), PlayerHolder.class);
	List<Player> players = playerHolder.getElements();

	Assert.assertNotNull(players);
	Assert.assertTrue(!players.isEmpty());
    }

    @Test
    public void getSpecificPlayerDataTest() throws Exception {
	Optional<String> op = getPlayerService().getSpecificPlayerData(PLAYER_ID);
	Assert.assertTrue(op.isPresent());

	op.get();
    }

    @Before
    public void init() {
	playerService = new PlayerServiceImpl();
    }

    private PlayerService getPlayerService() {
	return playerService;
    }
}
