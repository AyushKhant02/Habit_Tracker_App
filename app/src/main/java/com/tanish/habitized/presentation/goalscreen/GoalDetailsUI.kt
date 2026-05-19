package com.tanish.habitized.presentation.goalscreen

import com.tanish.habitized.domain.model.CountParam
import com.tanish.habitized.domain.model.Frequency
import com.tanish.habitized.domain.model.Habit
import com.tanish.habitized.domain.model.HabitProgress
import com.tanish.habitized.domain.model.HabitType
import com.tanish.habitized.domain.model.ImageProgress
import com.tanish.habitized.presentation.goalscreen.components.GraphType
import java.time.LocalDate
import java.time.LocalTime
import java.util.UUID

data class GoalDetailsUI(
    val id : UUID? = null,
    val title : String = "",
    val description : String = "",
    val targetDate : LocalDate ? = null,
    val startDate : LocalDate = LocalDate.now(),

    val showedGraphType : GraphType = GraphType.last_week,
    val effortList : List<Effort> = listOf(),
    val showedEfforts : List<Effort> = listOf(),

    val habits : List<Habit> = emptyList(),
    val onTrack : List<Habit> = emptyList(),
    val offTrack : List<Habit> = emptyList(),
    val AtRisk : List<Habit> = emptyList(),
    val closed : List<Habit> = emptyList()

)
data class Effort(val day: LocalDate, val effortLevel: Float)

