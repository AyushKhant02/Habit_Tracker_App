package com.tanish.habitized.data.local.mapper

import com.tanish.habitized.data.local.entity.GoalEntity
import com.tanish.habitized.data.local.entity.HabitEntity
import com.tanish.habitized.domain.model.CountParam
import com.tanish.habitized.domain.model.Frequency
import com.tanish.habitized.domain.model.Goal
import com.tanish.habitized.domain.model.Habit
import com.tanish.habitized.domain.model.HabitType

fun Goal.toEntity(): GoalEntity {
    return GoalEntity(
        goal_id=id,
        title = title,
        description = description,
        target_date = target_date,
        start_date = start_date,
        progress = progress,
    )
}

fun GoalEntity.toGoal(habits :List<Habit>) : Goal {
    return Goal(
        id=goal_id,
        title = title,
        description = description,
        target_date = target_date,
        start_date = start_date,
        progress = progress,
        habits = habits
    )
}