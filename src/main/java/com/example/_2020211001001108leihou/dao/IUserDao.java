package com.example._2020211001001108leihou.dao;

import com.example._2020211001001108leihou.model.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public interface IUserDao {
    public boolean saveUser(Connection con, User user) throws SQLException;
    public String deleteUser(Connection con, User user) throws SQLException;
    public String updateUser(Connection con, User user) throws SQLException;

    public User findById(Connection con, String id) throws SQLException;
    public User findByUsernamePassword(Connection con, String username,String password) throws SQLException;
    public List<User> findByUsername(Connection con, String username) throws SQLException;
    public List<User> findByPassword(Connection con, String password) throws SQLException;
    public List<User> findByEmail(Connection con,String email) throws SQLException;
    public List<User> findByGender(Connection con,String gender) throws SQLException;
    public List<User> findByBirthdate(Connection con, String birthDate) throws SQLException;
    public List<User> findAllUser(Connection con) throws SQLException;


}