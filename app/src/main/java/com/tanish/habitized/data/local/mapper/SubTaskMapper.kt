package com.tanish.habitized.data.local.mapper

import com.tanish.habitized.data.local.entity.SubtaskEntity
import com.tanish.habitized.domain.model.SubTask

fun SubTask.toEntity() : SubtaskEntity {
    return SubtaskEntity(
        subtaskId = subtaskId,
        habitProgressId = habitProgressId,
        title = title,
        isCompleted = isCompleted
    )
}

fun SubtaskEntity.toSubTask() : SubTask {
   return SubTask(
       subtaskId = subtaskId,
       habitProgressId = habitProgressId,
       title = title,
       isCompleted = isCompleted
   )
}