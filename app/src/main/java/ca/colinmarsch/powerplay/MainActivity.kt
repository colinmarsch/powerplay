package ca.colinmarsch.powerplay

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import ca.colinmarsch.core.models.Player
import ca.colinmarsch.core.models.Team
import ca.colinmarsch.feature.teams.TeamScreen

class MainActivity : ComponentActivity() {
    private val demoTeam = Team(
        name = "Winnipeg Jets",
        players = listOf(
            Player(
                name = "Kyle Connor",
                imageUrl = "",
                number = 81,
            ),
            Player(
                name = "Stuart Skinner",
                imageUrl = "",
                number = 74,
            ),
            Player(
                name = "Cole Perfetti",
                imageUrl = "",
                number = 91,
            ),
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                TeamScreen(demoTeam)
            }
        }
    }
}
