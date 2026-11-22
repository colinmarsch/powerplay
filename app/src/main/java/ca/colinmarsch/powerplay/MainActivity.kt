package ca.colinmarsch.powerplay

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import ca.colinmarsch.core.models.Player
import ca.colinmarsch.core.models.PlayerPosition
import ca.colinmarsch.core.models.Team
import ca.colinmarsch.feature.teams.RosterScreen

class MainActivity : ComponentActivity() {
    private val demoTeam = Team(
        name = "Demo Team",
        players = listOf(
            Player(
                name = "Player One",
                imageUrl = "",
                number = 81,
                position = PlayerPosition.Forward,
            ),
            Player(
                name = "Player Two",
                imageUrl = "",
                number = 74,
                position = PlayerPosition.Goalie,
            ),
            Player(
                name = "Player Three",
                imageUrl = "",
                number = 91,
                position = PlayerPosition.Forward,
            ),
            Player(
                name = "Player Nen",
                imageUrl = "",
                number = 91,
                position = PlayerPosition.Forward,
            ),
            Player(
                name = "Player Cinq",
                imageUrl = "",
                number = 91,
                position = PlayerPosition.Forward,
            ),
            Player(
                name = "Player Neuf",
                imageUrl = "",
                number = 91,
                position = PlayerPosition.Forward,
            ),
            Player(
                name = "Player Ninety",
                imageUrl = "",
                number = 91,
                position = PlayerPosition.Defence,
            ),
            Player(
                name = "Player Eighty-Five",
                imageUrl = "",
                number = 91,
                position = PlayerPosition.Forward,
            ),
            Player(
                name = "Player Seven",
                imageUrl = "",
                number = 91,
                position = PlayerPosition.Forward,
            ),
            Player(
                name = "Player Four",
                imageUrl = "",
                number = 91,
                position = PlayerPosition.Forward,
            ),
            Player(
                name = "Player Sixteen",
                imageUrl = "",
                number = 91,
                position = PlayerPosition.Forward,
            ),
            Player(
                name = "Player Eight",
                imageUrl = "",
                number = 91,
                position = PlayerPosition.Goalie,
            ),
        )
    )

    private val teamList = listOf(demoTeam)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                RosterScreen(demoTeam)
            }
        }
    }
}
