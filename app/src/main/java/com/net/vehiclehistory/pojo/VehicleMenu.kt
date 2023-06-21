package com.net.vehiclehistory.pojo

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "VehicleMenu")
class VehicleMenu {
    @PrimaryKey(autoGenerate = false)
    @NonNull
    @ColumnInfo(name = "VehicleName")
    var vehicleName = ""

    var totalMileage : Long = 0L
    var totalCapacity = 0L
    var lastTime : Long = 0L
}