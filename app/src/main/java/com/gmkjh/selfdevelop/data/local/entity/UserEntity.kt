package com.gmkjh.selfdevelop.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "user_id")
    val userId: Long = 0L,

    @ColumnInfo(name = "nickname")
    val nickname: String,

    @ColumnInfo(name = "character_type")
    val characterType: String = "default",

    @ColumnInfo(name = "total_growth_point")
    val totalGrowthPoint: Int = 0,

    @ColumnInfo(name = "character_level")
    val characterLevel: Int = 1

    )
