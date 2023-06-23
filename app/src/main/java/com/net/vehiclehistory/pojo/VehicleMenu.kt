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
    @ColumnInfo(name = "totalName")
    var totalMileage : Long = 0L
    @ColumnInfo(name = "totalCapacity")
    var totalCapacity = 0L
    @ColumnInfo(name = "lastTime")
    var lastTime : Long = 0L

    constructor() {}

    constructor(vehicleName: String, totalMileage: Long, totalCapacity: Long, lastTime: Long) {
        this.vehicleName = vehicleName
        this.totalMileage = totalMileage
        this.totalCapacity = totalCapacity
        this.lastTime = lastTime
    }
}