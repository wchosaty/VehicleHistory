package com.net.vehiclehistory.dao

import androidx.room.*
import com.net.vehiclehistory.pojo.VehicleMenu

@Dao
interface VehicleMenuDao {

    @Insert
    fun insertVehicleMenu(vehicleMenu: VehicleMenu)

    @Delete
    fun deleteVehicleMenu(vehicleMenu: VehicleMenu)

    @Query("SELECT * FROM VehicleMenu WHERE VehicleName = :vehicleName")
    fun findVehicleMenu(vehicleName: String)

    @Update
    fun upDate(vehicleMenu: VehicleMenu)
}