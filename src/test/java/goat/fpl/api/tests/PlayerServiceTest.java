package goat.fpl.api.tests;

import goat.fpl.api.PlayerService;
import goat.fpl.api.impl.JsonParserHelper;
import goat.fpl.api.impl.PlayerServiceImpl;
import goat.fpl.domain.player.Player;
import goat.fpl.domain.player.PlayerHolder;
import goat.fpl.domain.player.PlayerSummary;
import goat.fpl.domain.player.PlayerSummaryHolder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

public class PlayerServiceTest {

    private static final long PLAYER_ID = 104l; // eden hazard

    private PlayerService playerService;

    @Test
    public void getPlayersDataTest() throws Exception {
	Optional<String> op = getPlayerService().getPlayersData();
	Assert.assertTrue(op.isPresent());

        PlayerHolder playerHolder = JsonParserHelper.readValue(op.get(), PlayerHolder.class);
        List<Player> players = playerHolder.getElements();

	Assert.assertNotNull(players);
	Assert.assertTrue(!players.isEmpty());
    }

    @Test
    public void getSpecificPlayerDataTest() throws Exception {
	Optional<String> op = getPlayerService().getSpecificPlayerData(PLAYER_ID);
	Assert.assertTrue(op.isPresent());

        PlayerSummaryHolder holder = JsonParserHelper.readValue(op.get(), PlayerSummaryHolder.class);
        Assert.assertNotNull(holder);

        List<PlayerSummary> history = holder.getHistory();

        Assert.assertNotNull(history);
        Assert.assertTrue(!history.isEmpty());
    }

    @Before
    public void init() {
	playerService = new PlayerServiceImpl();
    }

    private PlayerService getPlayerService() {
	return playerService;
    }
}
