package com.tanish.habitized.presentation.homescreen
import com.tanish.habitized.domain.model.Habit
import com.tanish.habitized.domain.model.HabitProgress
import com.tanish.habitized.domain.model.HabitWithProgress
import com.tanish.habitized.domain.model.OneTimeTask
import java.time.LocalDate

data class HomeScreenUI(
    val habitWithProgressList: List<HabitWithProgress> = emptyList(),
    val todos : List<OneTimeTask> = emptyList(),
    val selectedOption : HomeScreenOption = HomeScreenOption.Habits,
    val selectedDate : LocalDate = LocalDate.now(),

    val ongoingHabit : HabitWithProgress? = null,
    val ongoingHour : Int = 0,
    val ongoingMinute : Int = 0,
    val ongoingSecond : Int = 0,

    val isShowingDatePicker : Boolean = false
)

enum class HomeScreenOption{
    Habits,
    Todos
}