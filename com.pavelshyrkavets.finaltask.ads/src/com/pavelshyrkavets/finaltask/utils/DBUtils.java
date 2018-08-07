package com.pavelshyrkavets.finaltask.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.pavelshyrkavets.finaltask.beans.Admins;
import com.pavelshyrkavets.finaltask.beans.Ads;
import com.pavelshyrkavets.finaltask.beans.Clients;
import com.pavelshyrkavets.finaltask.beans.Topics;
import com.pavelshyrkavets.finaltask.beans.UserAccount;
 
public class DBUtils {
 
    public static UserAccount findUser(Connection conn, String userName, String password) throws SQLException {
 
        String sql = "Select a.userName, a.password from UserAccount a "
                	 + "where a.userName = ? and a.password = ?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, userName);
        pstm.setString(2, password);
        ResultSet rs = pstm.executeQuery();
 
        if (rs.next()) {
            UserAccount user = new UserAccount();
            user.setUserName(userName);
            user.setPassword(password);
            return user;
        }
        return null;
    }
 
    public static UserAccount findUser(Connection conn, String userName) throws SQLException {
 
        String sql = "Select a.userName, a.password from UserAccount a "
                	 + "where a.userName = ?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, userName);
        ResultSet rs = pstm.executeQuery();
 
        if (rs.next()) {
            String password = rs.getString("password");
            UserAccount user = new UserAccount();
            user.setUserName(userName);
            user.setPassword(password);
            return user;
        }
        return null;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static List<Clients> queryClients(Connection conn) throws SQLException {
    	
        String sql = "Select a.c_id, a.c_name, a.c_email, a.c_telnum from Clients a";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        List<Clients> list = new ArrayList<Clients>();
        
        while (rs.next()) {
            int c_id = rs.getInt("c_id");
            String c_name = rs.getString("c_name");
            String c_email = rs.getString("c_email");
            String c_telnum = rs.getString("c_telnum");
            Clients client = new Clients();
            client.setCId(c_id);
            client.setCName(c_name);
            client.setCEmail(c_email);
            client.setCTelNum(c_telnum);
            list.add(client);
        }
        return list;
    }
 
    public static Clients findClient(Connection conn, int c_id) throws SQLException {
    	
        String sql = "Select a.c_id, a.c_name, a.c_email, a.c_telnum from Clients a where a.c_id = ?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, c_id);
        ResultSet rs = pstm.executeQuery();
 
        while (rs.next()) {
            String c_name = rs.getString("c_name");
            String c_email = rs.getString("c_email");
            String c_telnum = rs.getString("c_telnum");
            Clients client = new Clients(c_id, c_name, c_email, c_telnum);
            return client;
        }
        return null;
    }
 
    public static void updateClient(Connection conn, Clients client) throws SQLException {
    	
        String sql = "Update Clients set c_name = ?, c_email = ?, c_telnum = ? where c_id = ?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, client.getCName());
        pstm.setString(2, client.getCEmail());
        pstm.setString(3, client.getCTelNum());
        pstm.setInt(4, client.getCId());
        pstm.executeUpdate();
    }
 
    public static void insertClient(Connection conn, Clients client) throws SQLException {
    	
        String sql = "Insert into Clients(c_id, c_name, c_email, c_telnum) values (?,?,?,?)";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, client.getCId());
        pstm.setString(2, client.getCName());
        pstm.setString(3, client.getCEmail());
        pstm.setString(4, client.getCTelNum());
        pstm.executeUpdate();
    }
 
    public static void deleteClient(Connection conn, int c_id) throws SQLException {
    	
        String sql = "Delete From Clients where c_id = ?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, c_id);
        pstm.executeUpdate();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static List<Admins> queryAdmins(Connection conn) throws SQLException {
    	
        String sql = "Select a.a_id, a.a_name, a.a_email, a.a_telnum from Admins a";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        List<Admins> list = new ArrayList<Admins>();
        
        while (rs.next()) {
            int a_id = rs.getInt("a_id");
            String a_name = rs.getString("a_name");
            String a_email = rs.getString("a_email");
            String a_telnum = rs.getString("a_telnum");
            Admins admin = new Admins();
            admin.setAId(a_id);
            admin.setAName(a_name);
            admin.setAEmail(a_email);
            admin.setATelNum(a_telnum);
            list.add(admin);
        }
        return list;
    }
 
    public static Admins findAdmin(Connection conn, int a_id) throws SQLException {
    	
        String sql = "Select a.a_id, a.a_name, a.a_email, a.a_telnum from Admins a where a.a_id = ?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, a_id);
        ResultSet rs = pstm.executeQuery();
 
        while (rs.next()) {
            String a_name = rs.getString("a_name");
            String a_email = rs.getString("a_email");
            String a_telnum = rs.getString("a_telnum");
            Admins admin = new Admins(a_id, a_name, a_email, a_telnum);
            return admin;
        }
        return null;
    }
 
    public static void updateAdmin(Connection conn, Admins admin) throws SQLException {
    	
        String sql = "Update Admins set a_name = ?, a_email = ?, a_telnum = ? where a_id = ?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, admin.getAName());
        pstm.setString(2, admin.getAEmail());
        pstm.setString(3, admin.getATelNum());
        pstm.setInt(4, admin.getAId());
        pstm.executeUpdate();
    }
 
    public static void insertAdmin(Connection conn, Admins admin) throws SQLException {
    	
        String sql = "Insert into Admins(a_id, a_name, a_email, a_telnum) values (?,?,?,?)";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, admin.getAId());
        pstm.setString(2, admin.getAName());
        pstm.setString(3, admin.getAEmail());
        pstm.setString(4, admin.getATelNum());
        pstm.executeUpdate();
    }
 
    public static void deleteAdmin(Connection conn, int a_id) throws SQLException {
    	
        String sql = "Delete From Admins where a_id = ?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, a_id);
        pstm.executeUpdate();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static List<Topics> queryTopics(Connection conn) throws SQLException {
    	
        String sql = "Select a.t_id, a.t_name from Topics a";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        List<Topics> list = new ArrayList<Topics>();
        
        while (rs.next()) {
            int t_id = rs.getInt("t_id");
            String t_name = rs.getString("t_name");
            Topics topic = new Topics();
            topic.setTId(t_id);
            topic.setTName(t_name);
            list.add(topic);
        }
        return list;
    }
 
    public static Topics findTopic(Connection conn, int t_id) throws SQLException {
    	
        String sql = "Select a.t_id, a.t_name from Topics a where a.t_id = ?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, t_id);
        ResultSet rs = pstm.executeQuery();
 
        while (rs.next()) {
            String t_name = rs.getString("t_name");
            Topics topic = new Topics(t_id, t_name);
            return topic;
        }
        return null;
    }
 
    public static void updateTopic(Connection conn, Topics topic) throws SQLException {
    	
        String sql = "Update Topics set t_name = ? where t_id = ?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, topic.getTName());
        pstm.setInt(2, topic.getTId());
        pstm.executeUpdate();
    }
 
    public static void insertTopic(Connection conn, Topics topic) throws SQLException {
    	
        String sql = "Insert into Topics(t_id, t_name) values (?,?)";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, topic.getTId());
        pstm.setString(2, topic.getTName());
        pstm.executeUpdate();
    }
 
    public static void deleteTopic(Connection conn, int t_id) throws SQLException {
    	
        String sql = "Delete From Topics where t_id = ?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, t_id);
        pstm.executeUpdate();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static List<Ads> queryAds(Connection conn) throws SQLException {
    	
        String sql = "Select a.ad_id, a.ad_tname, a.ad_name, a.ad_descrip, a.ad_price, a.ad_cemail, a.ad_mark from Ads a";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        List<Ads> list = new ArrayList<Ads>();
        
        while (rs.next()) {
            int ad_id = rs.getInt("ad_id");
            String ad_tname = rs.getString("ad_tname");
            String ad_name = rs.getString("ad_name");
            String ad_descrip = rs.getString("ad_descrip");
            String ad_price = rs.getString("ad_price");
            String ad_cemail = rs.getString("ad_cemail");
            int ad_mark = rs.getInt("ad_mark");
            Ads ad = new Ads();
            ad.setAdId(ad_id);
            ad.setAdTName(ad_tname);
            ad.setAdName(ad_name);
            ad.setAdDescrip(ad_descrip);
            ad.setAdPrice(ad_price);
            ad.setAdCEmail(ad_cemail);
            ad.setAdMark(ad_mark);
            list.add(ad);
        }
        return list;
    }
 
    public static Ads findAd(Connection conn, int ad_id) throws SQLException {
    	
        String sql = "Select a.ad_id, a.ad_tname, a.ad_name, a.ad_descrip, a.ad_price, a.ad_cemail, a.ad_mark from Ads a " 
        			 + "where a.ad_id = ?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, ad_id);
        ResultSet rs = pstm.executeQuery();
 
        while (rs.next()) {
            String ad_tname = rs.getString("ad_tname");
            String ad_name = rs.getString("ad_name");
            String ad_descrip = rs.getString("ad_descrip");
            String ad_price = rs.getString("ad_price");
            String ad_cemail = rs.getString("ad_cemail");
            int ad_mark = rs.getInt("ad_mark");
            Ads ad = new Ads(ad_id, ad_tname, ad_name, ad_descrip, ad_price, ad_cemail, ad_mark);
            return ad;
        }
        return null;
    }
 
    public static void updateAd(Connection conn, Ads ad) throws SQLException {
    	
        String sql = "Update Ads set ad_tname = ?, ad_name = ?, ad_descrip = ?, ad_price = ?, ad_cemail = ?, ad_mark = ? " 
        + "where ad_id = ?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, ad.getAdTName());
        pstm.setString(2, ad.getAdName());
        pstm.setString(3, ad.getAdDescrip());
        pstm.setString(4, ad.getAdPrice());
        pstm.setString(5, ad.getAdCEmail());
        pstm.setInt(6, ad.getAdMark());
        pstm.setInt(7, ad.getAdId());
        pstm.executeUpdate();
    }
 
    public static void insertAd(Connection conn, Ads ad) throws SQLException {
    	
      String sql = "Insert into Ads(ad_id, ad_tname, ad_name, ad_descrip, ad_price, ad_cemail, ad_mark) values (?,?,?,?,?,?,?)";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, ad.getAdId());
        pstm.setString(2, ad.getAdTName());
        pstm.setString(3, ad.getAdName());
        pstm.setString(4, ad.getAdDescrip());
        pstm.setString(5, ad.getAdPrice());
        pstm.setString(6, ad.getAdCEmail());
        pstm.setInt(7, ad.getAdMark());
        pstm.executeUpdate();
    }
 
    public static void deleteAd(Connection conn, int ad_id) throws SQLException {
    	
        String sql = "Delete From Ads where ad_id = ?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, ad_id);
        pstm.executeUpdate();
    }
 }
