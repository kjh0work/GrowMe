package com.gmkjh.selfdevelop.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "daily_records",
    foreignKeys = [
        ForeignKey(
            entity = CategoryEntity::class,
            parentColumns = ["category_id"],
            childColumns = ["category_id"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index(value = ["category_id"]), Index(
        value = ["category_id", "record_date"],
        unique = true
    )]
)
data class DailyRecordEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "daily_record_id")
    val dailyRecordId: Long = 0L,

    @ColumnInfo(name = "category_id")
    val categoryId: Long,

    @ColumnInfo(name = "record_date")
    val recordDate: String,

    @ColumnInfo(name = "achieved_value")
    val achievedValue: Int = 0,

    @ColumnInfo(name = "is_completed")
    val isCompleted: Boolean = false,

    @ColumnInfo(name = "earned_growth_point")
    val earnedGrowthPoint: Int = 0,

    @ColumnInfo(name = "memo")
    val memo: String = ""
)
