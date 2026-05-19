package com.tanish.habitized.presentation.habitscreen

import android.graphics.Bitmap
import com.tanish.habitized.domain.model.CountParam
import com.tanish.habitized.domain.model.Frequency
import com.tanish.habitized.domain.model.HabitProgress
import com.tanish.habitized.domain.model.HabitType
import com.tanish.habitized.domain.model.ImageProgress
import com.tanish.habitized.domain.model.ReminderType
import java.time.LocalDate
import java.time.LocalTime
import java.util.UUID

data class ShareCardUI(
    val title : String = "",
    val currentStreak :Int = 0,
    val frequency: Frequency = Frequency.Daily,
    val colorKey : String = "",
    val selectedBackground : Background = Background.Default,
    val imageBgBitmap : Bitmap? = null,
    val startDate: LocalDate = LocalDate.now(),
    val daysOfMonth : List<Int>? = emptyList(),
    val daysOfWeek: List<Int> = mutableListOf(1,1,1,1,1,1,1),
    val progressList : List<HabitProgress> = emptyList(),
    val WeeklyDateRange : List<LocalDate> = emptyList(),
    val OverAllDateRange : List<LocalDate> = emptyList(),
)

enum class Background{
    Default,
    Custom
}