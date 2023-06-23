package com.net.vehiclehistory.dao

import androidx.room.*
import com.net.vehiclehistory.pojo.Vehicle

@Dao
interface VehicleDao {

    @Insert
    fun insertVehicle(vehicle: Vehicle)

    @Delete
    fun deleteVehicle(vehicle: Vehicle)

    @Query("SELECT * FROM vehicle WHERE vehicleName = :vehicleName")
    fun findVehicle(vehicleName: String)

    @Update
    fun update(vehicle: Vehicle)
}