package com.tanish.habitized.presentation.timerscreen.durationScreen

import com.tanish.habitized.domain.model.HabitWithProgress
import com.tanish.habitized.presentation.timerscreen.Theme
import com.tanish.habitized.presentation.timerscreen.TimerState
import java.util.UUID

data class DurationUI(
    val  progressId: UUID? =  null,
    val habitWithProgress: HabitWithProgress? = null,
    val timerState : TimerState = TimerState.Not_Started,
    val theme : Theme = Theme.Normal,
    val isStarted : Boolean = false,
    val isThemesOpen : Boolean = false
)
