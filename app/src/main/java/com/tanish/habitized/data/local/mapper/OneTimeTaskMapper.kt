package com.tanish.habitized.data.local.mapper

import com.tanish.habitized.data.local.entity.OneTimeTaskEntity
import com.tanish.habitized.data.local.entity.SubtaskEntity
import com.tanish.habitized.domain.model.OneTimeTask
import com.tanish.habitized.domain.model.SubTask

fun OneTimeTask.toEntity() : OneTimeTaskEntity {
    return OneTimeTaskEntity(
        taskId = taskId,
        title = title,
        isCompleted = isCompleted,
        date = date,
        reminder_time = reminder_time
    )
}

fun OneTimeTaskEntity.toOneTimeTask() : OneTimeTask {
   return OneTimeTask(
       taskId = taskId,
       title = title,
       isCompleted = isCompleted,
       date = date,
       reminder_time = reminder_time,
   )
}