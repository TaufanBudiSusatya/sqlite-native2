package com.example.sqlite_taufan.db

import androidx.room.*

@Dao
interface UserDao {

//perintah untuk menampilkan data
    @Query("SELECT * FROM userinfo ORDER BY id DESC")
    fun getAllUserInfo(): List<UserEntity>?

//perintah untuk menambahkan data
    @Insert
    fun insertUser(user: UserEntity?)
//perintah untuk menghapus data
    @Delete
    fun deleteUser(user: UserEntity?)
//perintah untuk memperbarui
    @Update
    fun updateUser(user: UserEntity?)
}

