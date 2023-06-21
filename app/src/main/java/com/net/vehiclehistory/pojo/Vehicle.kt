package com.net.vehiclehistory.pojo

import androidx.annotation.NonNull
import androidx.compose.ui.text.input.KeyboardType
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "vehicle")
class Vehicle {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    var id : Long = 0

    @ColumnInfo(name = "vehicleName")
    var vehicleName : String = ""
    @ColumnInfo(name = "oilType")
    var oilType : String = ""
    @ColumnInfo(name = "oilCapacity")
    var oilCapacity : Long = 0L
    @ColumnInfo(name = "mileage")
    var mileage : Long = 0L
    @ColumnInfo(name = "time")
    var time : Long = 0L

    constructor() {}

    constructor(vehicleName : String,oilType: String, oilCapacity: Long, mileage: Long, time: Long) {
        this.vehicleName = vehicleName
        this.oilType = oilType
        this.oilCapacity = oilCapacity
        this.mileage = mileage
        this.time = time
    }

}