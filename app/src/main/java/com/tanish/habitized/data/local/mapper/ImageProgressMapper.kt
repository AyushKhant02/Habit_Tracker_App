package com.tanish.habitized.data.local.mapper

import com.tanish.habitized.data.local.entity.GoalEntity
import com.tanish.habitized.data.local.entity.HabitEntity
import com.tanish.habitized.data.local.entity.ImageProgressEntity
import com.tanish.habitized.domain.model.CountParam
import com.tanish.habitized.domain.model.Frequency
import com.tanish.habitized.domain.model.Goal
import com.tanish.habitized.domain.model.Habit
import com.tanish.habitized.domain.model.HabitType
import com.tanish.habitized.domain.model.ImageProgress

fun ImageProgress.toEntity(): ImageProgressEntity {
    return ImageProgressEntity(
        id = id,
        habitId = habitId,
        description = description,
        date = date,
        imagePath = imagePath
    )
}

fun ImageProgressEntity.toImageProgress(): ImageProgress {
    return ImageProgress(
        id = id,
        habitId = habitId,
        description = description,
        date = date,
        imagePath = imagePath
    )
}