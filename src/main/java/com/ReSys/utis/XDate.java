/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ReSys.utis;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author maing
 */
public class XDate {
    static SimpleDateFormat formater= new SimpleDateFormat();
    public static Date toDate (String date, String pattern){
        try {
            formater.applyPattern(pattern);
            formater.setLenient(false);
            return formater.parse(date);
        } catch (Exception e) {
            return null;
        }
    }
    public static String toString(Date date, String pattern){
        formater.applyPattern(pattern);
        return formater.format(date);
    }      
    public static Date addDays(Date date, long days){
        date.setTime(date.getTime()+days*24*60*60*1000);
        return date;
    }
}
