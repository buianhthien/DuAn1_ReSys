/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ReSys.dao;

import com.ReSys.entity.NhanVien;
import com.ReSys.utis.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maing
 */
public class NhanVienDAO extends ReSysDAO<NhanVien, String>{
    final  String INSERT_SQL="insert into NhanVien values (?,?,?,?,?)";
    final String UPDATE_SQL="update NhanVien set MatKhau = ?,HoTen = ?,VaiTro = ?, TinhTrang=? where MaNV =?";
    final String DELETE_SQL="delete from NhanVien where MaNV =?";
    final String SELECT_ALL_SQL="select * from NhanVien";
    final String SELECT_BY_ID_SQL="select * from NhanVien where MaNV = ?";
    @Override
    public void insert(NhanVien entity){
        JdbcHelper.update(INSERT_SQL, entity.getMaNV(),entity.getMatKhau(),entity.getHoTen(),entity.isVaiTro(), entity.isTinhTrang());
    }

    @Override
    public void update(NhanVien entity) {
        JdbcHelper.update(UPDATE_SQL,entity.getMatKhau(),entity.getHoTen(),entity.isVaiTro(),entity.isTinhTrang(),entity.getMaNV());        
    }

    @Override
    public void delete(String id) {
        
        JdbcHelper.update(DELETE_SQL,id);
    }

    @Override
    public List<NhanVien> selectAll() {
         return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien selectByID(String id) {
        List<NhanVien> list= selectBySql(SELECT_BY_ID_SQL,id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list= new ArrayList<>();
        try{
            ResultSet rs= JdbcHelper.query(sql, args);
            while(rs.next()){
                NhanVien entity= new NhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setVaiTro(rs.getBoolean("VaiTro"));
                entity.setTinhTrang(rs.getBoolean("TinhTrang"));
                list.add(entity);
            }
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return list;
    }
   
}

