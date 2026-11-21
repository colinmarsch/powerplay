package ca.colinmarsch.feature.teams

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ca.colinmarsch.core.models.Team

@Composable
fun TeamScreen(team: Team) {
    Scaffold(
        modifier = Modifier,
        topBar = {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.Center,
            ) {
                Text(text = team.name, style = MaterialTheme.typography.displayLarge)
            }
        },
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            items(items = team.players, key = { it.name }) { player ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 32.dp),
                ) {
                    // TODO: Display an image here

                    Text(
                        modifier = Modifier.weight(1f),
                        text = player.name,
                    )

                    Text(
                        text = player.number.toString(),
                    )
                }
            }
        }
    }
}
