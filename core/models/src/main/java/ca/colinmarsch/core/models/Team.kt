package ca.colinmarsch.core.models

data class Team(
    val name: String,
    val players: List<Player> = emptyList(),
)