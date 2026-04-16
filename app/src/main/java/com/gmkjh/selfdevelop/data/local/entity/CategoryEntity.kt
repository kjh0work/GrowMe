package com.gmkjh.selfdevelop.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "categories",
    foreignKeys = [
        ForeignKey(
            entity = UserEntity::class,
            parentColumns = ["user_id"],
            childColumns = ["user_id"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index(value = ["user_id"])]
)
data class CategoryEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "category_id")
    val categoryId: Long = 0L,

    @ColumnInfo(name = "user_id")
    val userId: Long,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "icon_type")
    val iconType: String = "default",

    @ColumnInfo(name = "goal_text")
    val goalText: String = "",

    @ColumnInfo(name = "daily_target_value")
    val dailyTargetValue: Int = 0,

    @ColumnInfo(name = "daily_target_unit")
    val dailyTargetUnit: String = "",

    @ColumnInfo(name = "weekly_target_value")
    val weeklyTargetValue: Int = 0,

    @ColumnInfo(name = "weekly_target_unit")
    val weeklyTargetUnit: String = "",

    @ColumnInfo(name = "monthly_target_value")
    val monthlyTargetValue: Int = 0,

    @ColumnInfo(name = "monthly_target_unit")
    val monthlyTargetUnit: String = "",

    @ColumnInfo(name = "color_theme")
    val colorTheme: String = "blue",

    @ColumnInfo(name = "is_active")
    val isActive: Boolean = true
)
