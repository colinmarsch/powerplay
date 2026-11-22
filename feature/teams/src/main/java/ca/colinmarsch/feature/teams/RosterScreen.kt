package ca.colinmarsch.feature.teams

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ca.colinmarsch.core.models.PlayerPosition
import ca.colinmarsch.core.models.Team

@Composable
fun RosterScreen(team: Team) {
    Scaffold(
        modifier = Modifier,
        topBar = {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
            ) {
                Text(
                    text = team.name,
                    fontSize = 32.sp,
                    style = MaterialTheme.typography.headlineLarge
                )
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
                PlayerRow(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    name = player.name,
                    number = player.number,
                    position = player.position,
                )
            }

            item {
                Spacer(Modifier.height(0.dp))
            }
        }
    }
}

@Composable
fun PlayerRow(
    name: String,
    number: Int,
    position: PlayerPosition,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .border(width = 1.dp, color = Color.DarkGray, shape = RoundedCornerShape(16.dp))
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Blue)
            )
        }

        Text(
            modifier = Modifier.weight(1f),
            text = name,
            fontSize = 24.sp,
            style = MaterialTheme.typography.titleMedium,
        )

        Text(
            text = "#$number",
            fontSize = 16.sp,
            style = MaterialTheme.typography.bodySmall,
        )

        Text(
            text = position.symbol,
            fontSize = 16.sp,
            style = MaterialTheme.typography.bodySmall,
        )
    }
}